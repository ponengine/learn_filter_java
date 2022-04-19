package com.example.customfilter.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@WebFilter("/wish")
@Component
public class CustomServletFilter implements Filter{

	Logger LOG= LoggerFactory.getLogger(CustomServletFilter.class);
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		LOG.info("CustomServletFilter.........");
		chain.doFilter(request, response);
		
	}

}
