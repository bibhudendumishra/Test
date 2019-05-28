package com.demo.convert.numbers.dao.impl;

import com.demo.convert.numbers.dao.NumberDao;
import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.model.NumberWordMapper;
import com.demo.convert.numbers.model.Number;
/**
* Implements Dao Layer to return Wording
* 
* 
* @author Bibhu Mishra
* 
*/
public class NumberDaoImpl implements NumberDao {
	
	private Number number;
	private static NumberWordMapper mapper = new NumberWordMapper();
	////////////////////////////////////////////////////////////////
	// Constructor
	////////////////////////////////////////////////////////////////
	public NumberDaoImpl(Number number) throws NumberExceptionMessage {
		super();
		this.number = number;
	}
	
	public NumberDaoImpl() throws NumberExceptionMessage {
		super();
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}
	
	////////////////////////////////////////////////////////////////
	//Return Word Equivalent - via mapper
	////////////////////////////////////////////////////////////////
	/**************************************
	 * <p> Data Access Layer.
	 * </p>
	 * @param int number
	 * @return String
	 **************************************/
	public String getNumberToWordMapping(int num) {
		return mapper.getWordMapping(num);
	}
	
}
