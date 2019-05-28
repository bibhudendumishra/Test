package com.demo.convert.numbers.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.demo.convert.numbers.dao.impl.NumberDaoImpl;
import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.model.Number;
import com.demo.convert.numbers.model.NumberWordMapper;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class NumberDaoTest {

	@Mock
	private NumberDao numDao ;
	
	@Mock
	private Number num ;
	
	@Mock
	NumberWordMapper mapper;
	
	@Before
	public void setup() throws NumberExceptionMessage {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	 public void DAO_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		numDao = new NumberDaoImpl();
		Assert.assertEquals("Twelve".toUpperCase(), numDao.getNumberToWordMapping(12));
	}
	
	@Test
	 public void DAO_SUCCESS_TEST_2() throws NumberRuntimeException, NumberExceptionMessage {
		numDao = new NumberDaoImpl();
		Assert.assertEquals("Thirty".toUpperCase(), numDao.getNumberToWordMapping(30));
	}
}
