package com.demo.convert.numbers.business.impl;

import com.demo.convert.numbers.business.NumberWordConvertBL;
import com.demo.convert.numbers.dao.NumberDao;
import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.model.Number;
import com.demo.convert.numbers.model.Word;
import com.demo.convert.numbers.utilities.Constants;

/**
* Implements Business Logic of converting Number to Word
* 
* 
* @author Bibhu Mishra
* 
*/
public class NumberWordConverBLImpl implements NumberWordConvertBL {

	private NumberDao numberDao; 
	private Number number;
	////////////////////////////////////////////////////////////////
	// Dependency Injection
	////////////////////////////////////////////////////////////////
	public NumberWordConverBLImpl(NumberDao numberDao, Number number) {
		this.numberDao = numberDao;
		this.number = number;
		numberDao.setNumber(number);
	}
	
	public NumberWordConverBLImpl(Number num) {
		this.number = num;
	}
	////////////////////////////////////////////////////////////////
	//Invoke business Logic to convert into Word - 1
	////////////////////////////////////////////////////////////////
	/**************************************
	 * <p> Return Converted Word
	 * </p>
	 * @return Word
	 **************************************/
	public Word convertNumberToWord() throws NumberExceptionMessage, NumberRuntimeException {
		try {	
			int numberN = Integer.parseInt(number.getNumber().trim());
			return new Word(convertToWord(numberN).toUpperCase());
		} catch(NumberFormatException ex){
			throw ex;
		}catch(Exception ex) {
			throw new NumberExceptionMessage(ex.getMessage());
		}
	}
	////////////////////////////////////////////////////////////////
	//Invoke business Logic to convert into Word - 2 With Number Parameter
	////////////////////////////////////////////////////////////////
	/**************************************
	 * <p> Return Converted Word
	 * </p>
	 * @param Number number
	 * @return Word
	 **************************************/
	public Word convertNumberToWord(Number numberN) throws NumberExceptionMessage, NumberRuntimeException {
		try {
			int number = Integer.parseInt(numberN.getNumber().trim());
			return new Word(convertToWord(number).toUpperCase());
		} catch(NumberFormatException ex){
			throw ex;
		}catch(Exception ex) {
			throw new NumberExceptionMessage(ex.getMessage());
		}
	}
	
	/**
	 * <p>Business Logic . .
	 * </p>
	 * @param int number
	 * @return String
	 */
	////////////////////////////////////////////////////////////////
	//Actual Logic
	////////////////////////////////////////////////////////////////
	private String convertToWord(int num) throws NumberExceptionMessage {
		
		if(num < Constants.ZERO)
			return ("-" + convertToWord(num));
		
		if(num < Constants.TWENTY)
			return numberDao.getNumberToWordMapping(num).toString().trim();
		
		if(num < Constants.HUNDRED)
			return (num % Constants.TEN == 0) ? numberDao.getNumberToWordMapping(num).toString() : 
										numberDao.getNumberToWordMapping(num - (num % Constants.TEN)) + " " + 
										numberDao.getNumberToWordMapping(num % Constants.TEN).trim();
		
		if(num < Constants.THOUSAND)
			return numberDao.getNumberToWordMapping(num/100).toString().trim() + " Hundred" +  
									 ((num % Constants.HUNDRED ==0) ? "" : " and "+convertToWord(num % Constants.HUNDRED));
		
		if(num < Constants.MILLION)
			return convertToWord(num / Constants.THOUSAND) + " Thousand" +  
									 ((num % Constants.THOUSAND==0) ? "" : " "+convertToWord(num % Constants.THOUSAND));
		
		if(num < Constants.BILLION)
			return convertToWord(num/Constants.MILLION) + " Million" +  
									((num % Constants.MILLION==0) ? "" : " " + convertToWord(num % Constants.MILLION));
		
		return null;
		
	}
}
