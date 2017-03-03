package com.spring.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.spring.domain.WiselyMessage;
import com.spring.domain.WiselyResponse;

@Controller
public class WsController {
   @MessageMapping("/welcome")  //1
   @SendTo("/topic/getResponse")  //2
   public WiselyResponse say(WiselyMessage message) throws Exception{
	   Thread.sleep(3000);
	   return new WiselyResponse("Welcome, " + message.getName() + "!");
   }
   /*
    *1.当浏览器向服务端并发送请求时，通过@MessageMapping映射/welcome这个
    *地址，类似于@RequestMapping
    *
    *2.当服务器端有消息时，会对订阅了@SendTo中的路径的浏览器发送消息
    */
}


