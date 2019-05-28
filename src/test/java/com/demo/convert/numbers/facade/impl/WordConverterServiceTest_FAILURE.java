package com.demo.convert.numbers.facade.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.facade.NumberToWordFacade;
import com.demo.convert.numbers.utilities.Constants;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class WordConverterServiceTest_FAILURE {
	
	@InjectMocks
	NumberToWordFacade wordNumberConverterService = new NumberToWordFacade();
	
	@Test
	public void ConvertToWording_1_SPECIAL_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ELEVEN THOUSAND ONE HUNDRED AND FIFTEEN", wordNumberConverterService.ConvertToWording("11,115"));
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.ConvertToWording("333,333").trim());
		Assert.assertEquals("FIVE MILLION FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.ConvertToWording("5,55,5555").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE MILLION NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.ConvertToWording("999,999,999").trim());
	}
	
	@Test
	public void ConvertToWording_NOT_SUPPORTED_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_NOT_SUPPORTED, wordNumberConverterService.ConvertToWording("1999999999").trim());
	}
	
	@Test
	public void ConvertToWording_INVALID_SPACE_BETWEEN_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_SPACE_BETWEEN, wordNumberConverterService.ConvertToWording("999 ,999,999").trim());
	}
	
	@Test
	public void ConvertToWording_INVALID_NON_NUMERIC_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_NON_NUMERIC, wordNumberConverterService.ConvertToWording("99*,999,999").trim());
		Assert.assertEquals(Constants.INVALID_NON_NUMERIC, wordNumberConverterService.ConvertToWording("99s999999").trim());
	}
	
	@Test
	public void ConvertToWording_INVALID_NULL_INPUT_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals(Constants.INVALID_WHITESPACE_ONLY, wordNumberConverterService.ConvertToWording("	 "));
		Assert.assertEquals(Constants.INVALID_WHITESPACE_ONLY, wordNumberConverterService.ConvertToWording(""));
	}
}
