package com.example.customfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.customfilter.filter.LoggingFilter;
import com.example.customfilter.filter.MyFilter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class CustomfilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomfilterApplication.class, args);
	}
	
//	@Bean
//	public FilterRegistrationBean<LoggingFilter> filterRegistrationBean(){
//		FilterRegistrationBean<LoggingFilter> registrationBean=new FilterRegistrationBean<>();
//		registrationBean.setFilter(new LoggingFilter());
//		registrationBean.addUrlPatterns("/wish/*");
//		registrationBean.setOrder(1);
//		return registrationBean;
//	}
//	
//	@Bean
//	public FilterRegistrationBean<MyFilter> filterMyfilter(){
//		FilterRegistrationBean<MyFilter> registrationBean=new FilterRegistrationBean<>();
//		registrationBean.setFilter(new MyFilter());
//		registrationBean.addUrlPatterns("/wish/*");
//		registrationBean.setOrder(2);
//		return registrationBean;
//	}
	
	@Bean
	public FilterRegistrationBean<MyFilter> swagger(){
		FilterRegistrationBean<MyFilter> registrationBean=new FilterRegistrationBean<>();
		registrationBean.setFilter(new MyFilter());
		registrationBean.addUrlPatterns("/api/*");
		//registrationBean.setOrder(2);
		return registrationBean;
	}

}
