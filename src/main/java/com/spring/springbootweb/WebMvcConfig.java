package com.spring.springbootweb;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebMvcConfig extends WebMvcConfigurerAdapter{
    
	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/ws").setViewName("/ws");
	}
	/*
	 * 配置viewController，为ws.html提供便捷的路径映射
	 */
}
