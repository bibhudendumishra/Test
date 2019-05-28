package com.demo.convert.numbers.service;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;


public interface WordConverter {
	
	String convertToWord() throws NumberExceptionMessage, NumberRuntimeException;

}
