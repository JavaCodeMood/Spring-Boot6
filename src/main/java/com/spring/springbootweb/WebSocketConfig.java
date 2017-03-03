package com.spring.springbootweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker  //1
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) { //2
		registry.addEndpoint("/endpointWisely").withSockJS();//3
	}
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry){//4
		registry.enableSimpleBroker("/topic");//5
	}
	
	/*
	 * 配置WebSocket,需要在配置类上使用@EnableWebSocketMessageBroker开
	 * 启WebSocket支持，并通过继承AbstractWebSocketMessageBrokerConfigurer类，重写
	 * 其方法来配置WebSocket
	 * 
	 * 1.通过@EnableWebSocketMessageBroker注解来开启使用STOMP协议来传输基于代理
	 * （Message broker)的消息，这时控制器支持使用@MessageMapping,就像使用@RequestMapping
	 * 一样。
	 * 
	 * 2.注册STOMP协议的节点(endpoint),并映射的指定URL
	 * 
	 * 3.注册一个STOMP的endpoint，并指定使用SockJS协议
	 * 
	 * 4.配置消息代理(Message Broker)
	 * 
	 * 5.广播式应配置一个/topic消息代理
	 */

}
