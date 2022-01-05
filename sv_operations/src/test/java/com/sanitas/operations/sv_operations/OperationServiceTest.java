package com.sanitas.operations.sv_operations;

import com.sanitas.operations.sv_operations.services.OperationsService;
import com.sanitas.operations.sv_operations.services.OperationsServiceImpl;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class OperationServiceTest{

     OperationsService operationsService;
     String operator;
    
    @BeforeEach
     void init() {
    	operationsService = new OperationsServiceImpl();
    	operator = "";
    }
   
    @Test
     void sumTest() {
    	operator += "sum";
        Float oper1 = Float.valueOf("1.1");
        Float oper2 = Float.valueOf("2.1");
       
        
        assertEquals("3.20", operationsService.operate(oper1, oper2, operator), 
        		() -> "sums are equal");
        
     
    }
    @Test
     void subtractTest() {
       operator += "subtract";
        Float oper1 = Float.valueOf("2.1");
        Float oper2 = Float.valueOf("1.1");
        assertEquals("1.00", operationsService.operate(oper1, oper2, operator), 
        		() -> "subtracts are equal");
    }
    
    @Test
    void invalideOperatorTest() {
    	operator += "divide";
    	Float oper1 = Float.valueOf("2.1");
        Float oper2 = Float.valueOf("1.1");
        assertEquals("3.20", operationsService.operate(oper1, oper2, operator), 
        		() -> "service takes sum as default if operator does not match");
    }
    
   

}
