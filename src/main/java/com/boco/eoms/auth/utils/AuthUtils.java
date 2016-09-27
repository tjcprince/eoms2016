package com.boco.eoms.auth.utils;

import java.text.ParseException;

import org.joda.time.DateTime;

import com.boco.eoms.auth.module.Token;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.ReadOnlyJWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

/**
 * token操作工具类
 * 
 * @author tanjianchao
 *
 */
public final class AuthUtils {

	private static final JWSHeader JWT_HEADER = new JWSHeader(JWSAlgorithm.HS256);
	private static final String TOKEN_SECRET = "aliceinwonderland";
	public static final String AUTH_HEADER_KEY = "Authorization";

	/**
	 * 根据请求头信息token 获取 subject
	 * 
	 * @param authHeader
	 * @return
	 * @throws ParseException
	 * @throws JOSEException
	 */
	public static String getSubject(String authHeader) throws ParseException, JOSEException {
		return decodeToken(authHeader).getSubject();
	}

	/**
	 * 解码token
	 * 
	 * @param authHeader
	 * @return
	 * @throws ParseException
	 * @throws JOSEException
	 */
	public static ReadOnlyJWTClaimsSet decodeToken(String authHeader) throws ParseException, JOSEException {
		SignedJWT signedJWT = SignedJWT.parse(getSerializedToken(authHeader));
		if (signedJWT.verify(new MACVerifier(TOKEN_SECRET))) {
			return signedJWT.getJWTClaimsSet();
		} else {
			throw new JOSEException("Signature verification failed");
		}
	}

	/**
	 * 创建token
	 * 
	 * @param host
	 * @param sub
	 * @return
	 * @throws JOSEException
	 */
	public static Token createToken(String host, String sub) throws JOSEException {
		JWTClaimsSet claim = new JWTClaimsSet();
		claim.setSubject(sub);// 主题
		claim.setIssuer(host);// 发行者
		claim.setIssueTime(DateTime.now().toDate());// 发行时间
		claim.setExpirationTime(DateTime.now().plusDays(14).toDate());// 过期时间

		JWSSigner signer = new MACSigner(TOKEN_SECRET);
		SignedJWT jwt = new SignedJWT(JWT_HEADER, claim);
		jwt.sign(signer);

		return new Token(jwt.serialize());
	}

	public static String getSerializedToken(String authHeader) {
		return authHeader.split(" ")[1];
	}
}
