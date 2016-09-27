package com.boco.eoms.auth.utils;

import org.mindrot.jbcrypt.BCrypt;

/**
 * 加密工具类
 * 
 * @author tanjianchao
 *
 */
public final class PasswordService {
	/**
	 * 加密
	 * 
	 * @param plaintext
	 * @return
	 */
	public static String hashPassword(String plaintext) {
		return BCrypt.hashpw(plaintext, BCrypt.gensalt());
	}

	/**
	 * 检验密码
	 * 
	 * @param plaintext
	 * @param hashed
	 * @return
	 */
	public static boolean checkPassword(String plaintext, String hashed) {
		return BCrypt.checkpw(plaintext, hashed);
	}
}
