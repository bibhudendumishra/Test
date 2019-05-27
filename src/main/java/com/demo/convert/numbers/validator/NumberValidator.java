package com.demo.convert.numbers.validator;

import com.demo.convert.numbers.exception.NumberExceptionMessage;

public interface NumberValidator {
	
	String validate() throws NumberExceptionMessage;
	

}
