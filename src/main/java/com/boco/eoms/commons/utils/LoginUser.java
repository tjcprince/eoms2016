package com.boco.eoms.commons.utils;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import com.boco.eoms.auth.utils.AuthUtils;
import com.boco.eoms.tawSystemUser.module.TawSystemUser;
import com.boco.eoms.tawSystemUser.service.TawSystemUserServiceI;
import com.nimbusds.jose.JOSEException;

public class LoginUser {
	public static TawSystemUser getUser(HttpServletRequest request){
		String authHeadKey = request.getHeader(AuthUtils.AUTH_HEADER_KEY);
		TawSystemUser user =null;
		if (authHeadKey != null) {
			String subject = null;
			try {
				subject = AuthUtils.getSubject(authHeadKey);
			} catch (ParseException | JOSEException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			TawSystemUserServiceI userService=(TawSystemUserServiceI) ApplicationUtil.getBean("tawSystemUserService");
			 user = userService.selectByPrimaryKey(subject);
		}
		return user;
	}
}
