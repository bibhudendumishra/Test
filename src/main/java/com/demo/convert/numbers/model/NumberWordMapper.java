package com.demo.convert.numbers.model;

import java.util.HashMap;
import java.util.Map;
/**
* Initializes and returns Word Equivalent
* 
* 
* @author Bibhu Mishra
* 
*/
public class NumberWordMapper {

	 private static Map<Integer, wordEnum> wordMapper = new HashMap<Integer, wordEnum> ();
	 
	 private enum wordEnum { ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, 
			THIRTEEN, FOURTEEN, FIFTEEN, SIXTEEN, SEVENTEEN, EIGHTEEN, NINTEEN,
			TWENTY, THIRTY, FORTY, FIFTY, SIXTY, SEVENTY, EIGHTY, NINTY }
		
	
	  static {
			wordMapper.put(0, wordEnum.ZERO);
			wordMapper.put(1, wordEnum.ONE);
			wordMapper.put(2, wordEnum.TWO);
			wordMapper.put(3, wordEnum.THREE);
			wordMapper.put(4, wordEnum.FOUR);
			wordMapper.put(5, wordEnum.FIVE);
			wordMapper.put(6, wordEnum.SIX);
			wordMapper.put(7, wordEnum.SEVEN);
			wordMapper.put(8, wordEnum.EIGHT);
			wordMapper.put(9, wordEnum.NINE);
			
			wordMapper.put(10, wordEnum.TEN);
			wordMapper.put(11, wordEnum.ELEVEN);
			wordMapper.put(12, wordEnum.TWELVE);
			wordMapper.put(13, wordEnum.THIRTEEN);
			wordMapper.put(14, wordEnum.FOURTEEN);
			wordMapper.put(15, wordEnum.FIFTEEN);
			wordMapper.put(16, wordEnum.SIXTEEN);
			wordMapper.put(17, wordEnum.SEVENTEEN);
			wordMapper.put(18, wordEnum.EIGHTEEN);
			wordMapper.put(19, wordEnum.NINTEEN);
			
			
			wordMapper.put(20, wordEnum.TWENTY);
			wordMapper.put(30, wordEnum.THIRTY);
			wordMapper.put(40, wordEnum.FORTY);
			wordMapper.put(50, wordEnum.FIFTY);
			wordMapper.put(60, wordEnum.SIXTY);
			wordMapper.put(70, wordEnum.SEVENTY);
			wordMapper.put(80, wordEnum.EIGHTY);
			wordMapper.put(90, wordEnum.NINTY);
	  }
	 public Map<Integer, wordEnum> getWordMapper() {
		return wordMapper;
	}

	public String getWordMapping(int i) {
			
			return wordMapper.get(i).toString();
		}
}
