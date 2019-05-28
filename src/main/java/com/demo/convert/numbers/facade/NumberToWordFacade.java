package com.demo.convert.numbers.facade;

import com.demo.convert.numbers.business.impl.NumberWordConverBLImpl;
import com.demo.convert.numbers.dao.impl.NumberDaoImpl;
import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.model.Number;
import com.demo.convert.numbers.service.WordConverter;
import com.demo.convert.numbers.service.impl.WordConverterService;
import com.demo.convert.numbers.utilities.Constants;
import com.demo.convert.numbers.validator.NumberValidator;
import com.demo.convert.numbers.validator.NumberValidatorImpl;

public class NumberToWordFacade {
	
	private WordConverter wordConverter;
	
	public String ConvertToWording(String number) throws NumberRuntimeException, NumberExceptionMessage {
		
		if(null==number) return Constants.INVALID_NULL_INPUT;
		
		////////////////////////////////////////////////////////////////
		// Validate Input
		////////////////////////////////////////////////////////////////
		NumberValidator numberValidator = new NumberValidatorImpl(number);
		String message = numberValidator.validate();
		if(message.equals(Constants.SUCCESS)) {
			this.wordConverter = new WordConverterService(new NumberWordConverBLImpl(new NumberDaoImpl(),new Number(number.replace(",", ""))));
			return this.wordConverter.convertToWord();
		}
		return message;
	}


	public WordConverter getWordConverter() {
		return wordConverter;
	}


	public void setWordConverter(WordConverter wordConverter) {
		this.wordConverter = wordConverter;
	}
}
