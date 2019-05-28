package com.demo.convert.numbers.service.impl;

import com.demo.convert.numbers.business.NumberWordConvertBL;
import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.model.Word;
import com.demo.convert.numbers.service.WordConverter;
/**
* Service Layer
* 
* 
* @author Bibhu Mishra
* 
*/
public class WordConverterService implements  WordConverter{
	
	private NumberWordConvertBL numberConverter;
	
	////////////////////////////////////////////////////////////////
	// IOC - Dependency Injection
	////////////////////////////////////////////////////////////////
	public WordConverterService(NumberWordConvertBL numberConverter) {
		this.numberConverter = numberConverter;
	}
    
	public String convertToWord() throws NumberExceptionMessage {
		
				////////////////////////////////////////////////////////////////
				//Invoke business Logic to convert into Word
				////////////////////////////////////////////////////////////////
				Word word = this.numberConverter.convertNumberToWord();
				return word.getWord();
	}

}
