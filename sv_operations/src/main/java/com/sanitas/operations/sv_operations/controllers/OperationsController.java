package com.sanitas.operations.sv_operations.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sanitas.operations.sv_operations.components.Configuration;
import com.sanitas.operations.sv_operations.services.OperationsService;
import com.sanitas.operations.utilities.Constants;

@RestController
public class OperationsController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OperationsService operationsService;

    @Autowired
    Configuration configuration;


    @GetMapping("/execute/{operation}")
    public String execute(@PathVariable Optional<String> operation) throws Exception{
    	ResponseStatusException ex = 
    			new ResponseStatusException(HttpStatus.BAD_REQUEST, Constants.INVALID_OPERATOR);
    	
        	if (!operation.isPresent()) {
        		throw ex;
        	}
        	
        	String sOperation = operation.get();
        	if (!(sOperation.equalsIgnoreCase(Constants.OPERATOR_SUM) ||
        			sOperation.equalsIgnoreCase(Constants.OPERATOR_SUBTRACT))){
        				throw ex;
        	}
        	
        	String result = operationsService.operate(
            		Float.parseFloat(configuration.getOperand1()),
            		Float.parseFloat(configuration.getOperand2()),
            		sOperation);
        	
            logger.info("operation result is " + result);
            
            return result;
        }
}

    

