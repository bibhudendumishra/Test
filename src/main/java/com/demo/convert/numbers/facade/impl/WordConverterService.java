package com.demo.convert.numbers.facade.impl;

import com.demo.convert.numbers.business.NumberWordConvertBL;
import com.demo.convert.numbers.business.impl.NumberWordConverBLImpl;
import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.facade.WordConverter;
import com.demo.convert.numbers.model.Number;
import com.demo.convert.numbers.model.Word;
import com.demo.convert.numbers.utilities.Constants;
import com.demo.convert.numbers.validator.NumberValidator;
import com.demo.convert.numbers.validator.NumberValidatorImpl;

/**
* Implements Facade pattern
* 
* 
* @author Bibhu Mishra
* 
*/
public class WordConverterService implements  WordConverter{

	public String convertToWord(String number) throws NumberExceptionMessage {
				
				if(null==number) return Constants.INVALID_NULL_INPUT;
				
				////////////////////////////////////////////////////////////////
				// Validate Input
				////////////////////////////////////////////////////////////////
				NumberValidator numberValidator = new NumberValidatorImpl(number);
				String message = numberValidator.validate();
				////////////////////////////////////////////////////////////////
				//Invoke business Logic to convert into Word
				////////////////////////////////////////////////////////////////
				if(message.equals(Constants.SUCCESS)) {
						NumberWordConvertBL numberConverter = new NumberWordConverBLImpl(new Number(number.replace(",", "")));
						Word word = numberConverter.convertNumberToWord();
						return word.getWord();
				}
				return message;
	}

}
