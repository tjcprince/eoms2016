package com.boco.eoms.webSocket.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;

import com.alibaba.fastjson.JSON;
import com.boco.eoms.sheet.module.Sheet;
import com.boco.eoms.user.module.User;
import com.boco.eoms.webSocket.hndler.SystemWebSocketHandler;

@Controller
@RequestMapping("/sock")
public class WebSocketController {
	 
   
	@Autowired
	SystemWebSocketHandler systemWebSocketHandler;
 
 
    @RequestMapping("/send")
    @ResponseBody
    public void send(HttpServletRequest request){
    	Sheet s=new Sheet();
    	s.setId("20");
    	s.setCreateUser("websocket");
    	s.setTitle("张三");
    	s.setContent("你猜");
    	
    	String str=JSON.toJSONString(s);
    	TextMessage t=new TextMessage(str);
    	systemWebSocketHandler.sendMessageToUsers(t);
        
    }
}
