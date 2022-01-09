package com.javatpoint.microservices.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.IZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLogginFilter implements IZuulFilter{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() {
		return true; //invokes the run() method
	}

	@Override
	public Object run() throws ZuulException {
		//details of the HTTP requests
		 HttpServletRequest request=RequestContext.getCurrentContext().getRequest();  
		 logger.info("request -> {} request uri-> {}", request, request.getRequestURI());
		 
		return null; 
	}

}
