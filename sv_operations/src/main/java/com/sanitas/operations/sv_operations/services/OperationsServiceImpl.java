package com.sanitas.operations.sv_operations.services;

import java.util.Locale;

import org.springframework.stereotype.Service;

import com.sanitas.operations.utilities.Constants;

@Service
public class OperationsServiceImpl implements OperationsService{

	@Override
	public String operate(Float num1, Float num2, String operator) {
		Locale locale = Locale.ENGLISH;
	     
	      if (operator.equalsIgnoreCase(Constants.SUM))
	    	  return String.format(locale, "%.2f", num1 + num2);
	      else if (operator.equalsIgnoreCase(Constants.SUBTRACT))
	    	  return String.format(locale, "%.2f", num1 - num2);
	      else
	    	  return String.format(locale, "%.2f", num1 + num2);
	      
	}

}
