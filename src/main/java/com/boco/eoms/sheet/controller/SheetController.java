package com.boco.eoms.sheet.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boco.eoms.sheet.module.Sheet;
import com.nimbusds.jose.JOSEException;

@Controller
@RequestMapping("/sheetController")
public class SheetController {
	@RequestMapping(value = { "querySheet" }, method = RequestMethod.GET)
	@ResponseBody
	public Response querySheet(String username, HttpServletRequest request) throws UnsupportedEncodingException, ParseException, JOSEException {
		List list=new ArrayList();
		Sheet sheet =new Sheet();
		sheet.setId("1");
		sheet.setCreateUser("张三");
		sheet.setTitle("北京");
		sheet.setContent("sdsadsdsadasdasd");
		list.add(sheet);
		for(int i=0;i<10;i++){
			Sheet sheet1 =new Sheet();
			sheet1.setId("1"+i);
			sheet1.setCreateUser("张三1"+i);
			sheet1.setTitle("北京1"+i);
			sheet1.setContent("内容"+i);
			list.add(sheet1);
		}
		
		
		
		return Response.ok().entity(list).build();
	}
}
