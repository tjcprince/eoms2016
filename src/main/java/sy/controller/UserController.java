package sy.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import sy.jdbc.UserJdbc;
import sy.module.TestXmlModle;
import sy.module.User;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	private UserServiceI userService;

	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}
	
	/**
	 * 返回xml  json数据
	 * @param id
	 * @param request
	 * @return
	 */
	//http://localhost:8080/SpringMVC-angular/userController/showUser2.json?id=1
	//http://localhost:8080/SpringMVC-angular/userController/showUser2.xml?id=1
	//http://localhost:8080/SpringMVC-angular/userController/showUser2.do?id=1
	@RequestMapping(value={"login"},method=RequestMethod.GET)
	public ModelAndView login(long id,HttpServletRequest request){
		ModelAndView mav=new ModelAndView();
		User u = userService.getUserById(id);
		mav.addObject("xmlModle", u);
		logger.info(mav.toString());
		return mav;
	}
	
	@RequestMapping(value={"signup"},method=RequestMethod.PUT)
	public ModelAndView signup(HttpServletRequest request){
		ModelAndView mav=new ModelAndView();
		logger.info(mav.toString());
		return mav;
	}
}
