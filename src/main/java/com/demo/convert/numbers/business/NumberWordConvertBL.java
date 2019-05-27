package com.demo.convert.numbers.business;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.model.Number;
import com.demo.convert.numbers.model.Word;

public interface NumberWordConvertBL {
	public Word convertNumberToWord() throws NumberExceptionMessage, NumberRuntimeException;
	
	public Word convertNumberToWord(Number numberN) throws NumberExceptionMessage, NumberRuntimeException;

}
