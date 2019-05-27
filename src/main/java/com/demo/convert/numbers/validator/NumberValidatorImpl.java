package com.demo.convert.numbers.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.utilities.Constants;

public class NumberValidatorImpl implements NumberValidator{

	private String number;
	
	//Constructor
	public NumberValidatorImpl(String num) {
		this.number = num;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String validate() throws NumberExceptionMessage {
		
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(this.number.trim());
		
		if(this.number==null)
			return Constants.INVALID_NULL_INPUT;

		else if(this.number.trim().isEmpty())
			return Constants.INVALID_WHITESPACE_ONLY;
		
		else if(! this.number.matches("[0-9, /,]+") )
			return Constants.INVALID_NON_NUMERIC;
		
		else if(matcher.find())
			return Constants.INVALID_SPACE_BETWEEN;
		
		else if((this.number.trim().replace(",", "").length()) > Constants.MAX_LENGTH)
			return Constants.INVALID_NOT_SUPPORTED;
		
		return Constants.SUCCESS;
		
	}
}
