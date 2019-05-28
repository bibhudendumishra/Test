package com.demo.convert.numbers.dao;

import com.demo.convert.numbers.model.Number;

public interface NumberDao {
	
	String getNumberToWordMapping(int num);
	void setNumber(Number number);
}
