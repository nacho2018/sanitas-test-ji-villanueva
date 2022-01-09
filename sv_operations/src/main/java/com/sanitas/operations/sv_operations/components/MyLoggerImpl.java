package com.sanitas.operations.sv_operations.components;

import org.springframework.stereotype.Component;

import com.sanitas.operations.sv_operations.logging.MyLogger;

import io.corp.calculator.TracerImpl;

@Component
public class MyLoggerImpl implements MyLogger<String>{

	@Override
	public void trace(String object) {
		TracerImpl tracerImpl = new TracerImpl();
		tracerImpl.trace(object);
		
	}

	

}
