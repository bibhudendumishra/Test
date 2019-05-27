package com.demo.convert.numbers.facade.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.facade.WordConverter;
import com.demo.convert.numbers.utilities.Constants;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class WordConverterServiceTest_FAILURE {
	
	@InjectMocks
	WordConverter wordNumberConverterService = new WordConverterService();
	
	@Test
	public void ConvertToWord_1_SPECIAL_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ELEVEN THOUSAND ONE HUNDRED AND FIFTEEN", wordNumberConverterService.convertToWord("11,115"));
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.convertToWord("333,333").trim());
		Assert.assertEquals("FIVE MILLION FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.convertToWord("5,55,5555").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE MILLION NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.convertToWord("999,999,999").trim());
	}
	
	@Test
	public void ConvertToWord_NOT_SUPPORTED_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_NOT_SUPPORTED, wordNumberConverterService.convertToWord("1999999999").trim());
	}
	
	@Test
	public void ConvertToWord_INVALID_SPACE_BETWEEN_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_SPACE_BETWEEN, wordNumberConverterService.convertToWord("999 ,999,999").trim());
	}
	
	@Test
	public void ConvertToWord_INVALID_NON_NUMERIC_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_NON_NUMERIC, wordNumberConverterService.convertToWord("99*,999,999").trim());
		Assert.assertEquals(Constants.INVALID_NON_NUMERIC, wordNumberConverterService.convertToWord("99s999999").trim());
	}
	
	@Test
	public void ConvertToWord_INVALID_NULL_INPUT_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_WHITESPACE_ONLY, wordNumberConverterService.convertToWord("	 "));
		Assert.assertEquals(Constants.INVALID_WHITESPACE_ONLY, wordNumberConverterService.convertToWord(""));
	}
}
