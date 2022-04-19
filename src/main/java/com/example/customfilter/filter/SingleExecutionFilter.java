package com.example.customfilter.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

//@Component
public class SingleExecutionFilter extends OncePerRequestFilter{

	
	Logger LOG= LoggerFactory.getLogger(SingleExecutionFilter.class);
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		LOG.info("OncePerRequestFilter invoked............");
		filterChain.doFilter(request, response);
		
	}

}
