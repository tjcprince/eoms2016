package com.boco.eoms.webSocket.config;

import com.boco.eoms.webSocket.hndler.InfoSocketEndPoint;
import com.boco.eoms.webSocket.hndler.SystemWebSocketHandler;
import com.boco.eoms.webSocket.interceptor.HandshakeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import org.springframework.context.annotation.Bean;

@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements
        WebSocketConfigurer {

    public WebSocketConfig() {
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(systemWebSocketHandler(), "/websck").addInterceptors(new HandshakeInterceptor());
        registry.addHandler(systemWebSocketHandler(), "/websckend").addInterceptors(new HandshakeInterceptor());
        System.out.println("registed!");
        registry.addHandler(systemWebSocketHandler(), "/sockjs/websck/info").addInterceptors(new HandshakeInterceptor())
                .withSockJS();

    }

    @Bean
    public WebSocketHandler systemWebSocketHandler() {
        //return new InfoSocketEndPoint();
        return new SystemWebSocketHandler();
    }
    
    @Bean
    public WebSocketHandler infoSocketEndPoint() {
        return new InfoSocketEndPoint();
    }

}