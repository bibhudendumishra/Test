package com.demo.convert.numbers.facade;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;


public interface WordConverter {
	
	String convertToWord(String str) throws NumberExceptionMessage, NumberRuntimeException;

}
