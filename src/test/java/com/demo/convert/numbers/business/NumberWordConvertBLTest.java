package com.demo.convert.numbers.business;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.demo.convert.numbers.business.impl.NumberWordConverBLImpl;
import com.demo.convert.numbers.dao.NumberDao;
import com.demo.convert.numbers.dao.impl.NumberDaoImpl;
import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.model.Number;
import com.demo.convert.numbers.model.Word;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class NumberWordConvertBLTest  {
	
	@Mock
	private NumberDao numDao ;
	
	@Mock
	private Number num ;
	
	@Mock
	private NumberWordConvertBL business;
	
	@Before
	public void setup() throws NumberExceptionMessage {
		MockitoAnnotations.initMocks(this);
	   business = new NumberWordConverBLImpl(new NumberDaoImpl(),new Number("123"));
	}
	
	@Test
	 public void BUSINESS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Word word = business.convertNumberToWord();
		Assert.assertEquals("One Hundred and twenty three".toUpperCase(), word.getWord());
	}
	
	@Test
	 public void BUSINESS_SUCCESS_2_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		business = new NumberWordConverBLImpl(new NumberDaoImpl(),new Number("345"));
		Word word = business.convertNumberToWord();
		Assert.assertEquals("Three Hundred and Forty Five".toUpperCase(), word.getWord());
	}
	
}
