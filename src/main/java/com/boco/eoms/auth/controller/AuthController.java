package com.boco.eoms.auth.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boco.eoms.auth.module.Token;
import com.boco.eoms.auth.utils.AuthUtils;
import com.boco.eoms.commons.utils.HttpClientUtil;
import com.boco.eoms.commons.utils.MD5Util;
import com.boco.eoms.tawSystemUser.module.TawSystemUser;
import com.boco.eoms.tawSystemUser.service.TawSystemUserServiceI;
import com.nimbusds.jose.JOSEException;

/**
 * token认证模块
 * 
 * @author tanjianchao
 *
 */
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
	private TawSystemUserServiceI tawSystemUserService;
	/**
	 * 用户注册
	 * @param user
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws JOSEException
	 */
	@RequestMapping(value = { "signup" }, method = RequestMethod.POST)
	@ResponseBody
	public Response signup(TawSystemUser user, HttpServletRequest request)
			throws UnsupportedEncodingException, JOSEException {
		List list = new ArrayList();
		// user.setPassword(PasswordService.hashPassword(user.getPassword()));

		user.setPassword(MD5Util.textToMD5L32(user.getPassword()));
		int num = tawSystemUserService.insert(user);
		// User userNew=userService.selectByEmail("tan@163.com");
		// final Token token = AuthUtils.createToken(request.getRemoteHost(),
		// userNew.getId());
		// Response.status(Status.CREATED).entity(token).build();
		// list.add(a);
		// return list;
		if (num == 1) {
			return Response.ok().entity(1).build();
		} else {
			return Response.status(Status.UNAUTHORIZED).entity(LOGING_ERROR_MSG).build();
		}
	}
	/**
	 * 用户登录
	 * @param user
	 * @param request
	 * @param response
	 * @return
	 * @throws JOSEException
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@RequestMapping(value = { "login" }, method = RequestMethod.POST)
	@ResponseBody
	public Response login(TawSystemUser user, HttpServletRequest request, HttpServletResponse response)
			throws JOSEException, ClientProtocolException, IOException {
		List list = new ArrayList();
		TawSystemUser userNew = tawSystemUserService.selectByUserid(user.getUserid());
		// if (PasswordService.checkPassword(user.getPassword(),
		// userNew.getPassword())) {
		// final Token token = AuthUtils.createToken(request.getRemoteHost(),
		// userNew.getId());
		// request.getSession().setAttribute("username", user.getEmail());
		// return Response.ok().entity(token).build();
		// }
		if (userNew.getPassword().equals(MD5Util.textToMD5L32(user.getPassword()))) {
			final Token token = AuthUtils.createToken(request.getRemoteHost(), userNew.getId());
			return Response.ok().entity(token).build();
		}
		return Response.status(Status.UNAUTHORIZED).entity(LOGING_ERROR_MSG).build();

	}
	/**
	 * 功能实验使用，后续删除
	 * @param username
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws ParseException
	 * @throws JOSEException
	 */
	@RequestMapping(value = { "getUser" }, method = RequestMethod.GET)
	@ResponseBody
	public Response getUser(String username, HttpServletRequest request)
			throws UnsupportedEncodingException, ParseException, JOSEException {
		List list = new ArrayList();
		// //解析token中的Subject(存的是用户id)
		// String subject =
		// AuthUtils.getSubject(request.getHeader(AuthUtils.AUTH_HEADER_KEY));
		// User u=userService.getUserById(Long.parseLong(subject));
		// if(u==null){
		// JSONObject obj=new JSONObject();
		// obj.put("mes", "验证不通过");
		// list.add(obj);
		// return Response.status(Status.UNAUTHORIZED).entity(list).build();
		// }
		// System.out.println("bbbbbccccc----" + u);
		// // System.out.println("bbbbb----"+new
		// // String(username.getBytes("ISO-8859-1"), "UTF-8"));
		//
		// list.add(u);
		return Response.ok().entity(list).build();
	}

	/**
	 * 测试使用，后续删除
	 * 
	 * @param request
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	@RequestMapping(value = { "loginEoms" }, method = RequestMethod.GET)
	@ResponseBody
	public Response loginEoms(HttpServletRequest request) throws ClientProtocolException, IOException {
		List list = new ArrayList();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
//		CloseableHttpResponse res = HttpClientUtil.post(
//				"http://10.50.14.89:9080/eoms35/sheet/commontask/commontask.do?method=getUser",
//				"userName=" + username + "&type=interface");
//
//		HttpClientUtil.printResponse(res);
		return Response.ok().entity(list).build();
	}
}
