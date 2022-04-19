package com.example.customfilter.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
//@Order(2)
public class LoggingFilter implements Filter{

	Logger LOG= LoggerFactory.getLogger(LoggingFilter.class);
			
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		LOG.info("Request information {}: {}: {}: {}",
				req.getMethod(),
				req.getServerPort()
				,req.getRequestURI()
				,req.getRequestURL()
				);
		chain.doFilter(req, res);
		LOG.info("Response information {}: {}",
				res.getContentType(),
				res.getStatus()
				);
	}

}
