package com.boco.eoms.filter;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;

import com.boco.eoms.auth.utils.AuthUtils;
import com.boco.eoms.user.module.User;
import com.boco.eoms.user.service.UserServiceI;
import com.nimbusds.jose.JOSEException;


public class AuthFilter implements Filter {
	private ServletContext servletContext;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("22222222222222222222222222222");
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;
		WebApplicationContext context = (WebApplicationContext) servletContext
				.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		UserServiceI userService = (UserServiceI) context.getBean("userService");
		System.out.println(request.getServletPath());
		if ("/auth/login".equals(request.getServletPath())) {
			chain.doFilter(req, res);
		} else if("/websck".equals(request.getServletPath())){
			chain.doFilter(req, res);
		}else if("/sock/send".equals(request.getServletPath())){
			chain.doFilter(req, res);
		}else {
			String authHeadKey = request.getHeader(AuthUtils.AUTH_HEADER_KEY);
			System.out.println(authHeadKey);
			if (authHeadKey != null) {
				String subject = null;
				try {
					subject = AuthUtils.getSubject(authHeadKey);
					System.out.println(subject);
				} catch (ParseException | JOSEException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				User u = userService.getUserById(Long.parseLong(subject));
				System.out.println(u);
				if (u != null) {
					chain.doFilter(req, res);
				}
			}

		}

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		servletContext = config.getServletContext();
	}

}
