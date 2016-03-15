package com.boco.eoms.auth.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.boco.eoms.auth.module.Token;
import com.boco.eoms.auth.utils.AuthUtils;
import com.boco.eoms.auth.utils.PasswordService;
import com.boco.eoms.user.module.User;
import com.boco.eoms.user.service.UserServiceI;
import com.nimbusds.jose.JOSEException;



@Controller
@RequestMapping("/auth")
public class AuthController {
	private static final Logger logger = Logger.getLogger(AuthController.class);
	  public static final String CLIENT_ID_KEY = "client_id", REDIRECT_URI_KEY = "redirect_uri",
		      CLIENT_SECRET = "client_secret", CODE_KEY = "code", GRANT_TYPE_KEY = "grant_type",
		      AUTH_CODE = "authorization_code";

		  public static final String CONFLICT_MSG = "There is already a %s account that belongs to you",
		      NOT_FOUND_MSG = "User not found", LOGING_ERROR_MSG = "Wrong email and/or password",
		      UNLINK_ERROR_MSG = "Could not unlink %s account because it is your only sign-in method";
	@Resource
	private UserServiceI userService;

	@RequestMapping(value = { "signup" }, method = RequestMethod.POST)
	@ResponseBody
	public Response signup(User user, HttpServletRequest request) throws UnsupportedEncodingException, JOSEException {
		List list=new ArrayList();
		user.setPassword(PasswordService.hashPassword(user.getPassword()));
		int a=userService.insert(user);
		//User userNew=userService.selectByEmail("tan@163.com");
		//final Token token = AuthUtils.createToken(request.getRemoteHost(), userNew.getId());
		//Response.status(Status.CREATED).entity(token).build();
		//list.add(a);
		//return list;
		if(a==1){
			return Response.ok().entity(1).build();
		}else{
			return Response.status(Status.UNAUTHORIZED).entity(LOGING_ERROR_MSG).build();
		}
	}

	@RequestMapping(value = { "login" }, method = RequestMethod.POST)
	@ResponseBody
	public Response login(User user, HttpServletRequest request) throws UnsupportedEncodingException, JOSEException {
		List list=new ArrayList();
		System.out.println(user.getEmail());
		User userNew=userService.selectByEmail(user.getEmail());
		    if (PasswordService.checkPassword(user.getPassword(), userNew.getPassword())) {
		      final Token token = AuthUtils.createToken(request.getRemoteHost(), userNew.getId());
		      return Response.ok().entity(token).build();
		    }
		    return Response.status(Status.UNAUTHORIZED).entity(LOGING_ERROR_MSG).build();
		
	}
	
	
	@RequestMapping(value = { "getUser" }, method = RequestMethod.GET)
	@ResponseBody
	public Response getUser(String username, HttpServletRequest request) throws UnsupportedEncodingException, ParseException, JOSEException {
		List list=new ArrayList();
//		//解析token中的Subject(存的是用户id)
//		String subject = AuthUtils.getSubject(request.getHeader(AuthUtils.AUTH_HEADER_KEY));
//		User u=userService.getUserById(Long.parseLong(subject));
//		if(u==null){
//			JSONObject obj=new JSONObject();
//			obj.put("mes", "验证不通过");
//			list.add(obj);
//			return Response.status(Status.UNAUTHORIZED).entity(list).build();
//		}
//		System.out.println("bbbbbccccc----" + u);
//		// System.out.println("bbbbb----"+new
//		// String(username.getBytes("ISO-8859-1"), "UTF-8"));
//		
//		list.add(u);
		return Response.ok().entity(list).build();
	}

}
