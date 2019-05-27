package com.demo.convert.numbers.facade.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.facade.WordConverter;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class WordConverterServiceTest_SUCCESS {
	
	@InjectMocks
	WordConverter wordNumberConverterService = new WordConverterService();
	
	@Test
	public void ConvertToWord_1_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		
		Assert.assertEquals("ZERO", wordNumberConverterService.convertToWord("0"));
		Assert.assertEquals("NINE", wordNumberConverterService.convertToWord("9"));
		Assert.assertEquals("TEN", wordNumberConverterService.convertToWord("10"));
		Assert.assertEquals("TWENTY", wordNumberConverterService.convertToWord("20"));
		Assert.assertEquals("THIRTY", wordNumberConverterService.convertToWord("30"));
		Assert.assertEquals("FORTY", wordNumberConverterService.convertToWord("40"));
		Assert.assertEquals("FIFTY", wordNumberConverterService.convertToWord("50"));
		Assert.assertEquals("SIXTY", wordNumberConverterService.convertToWord("60"));
		Assert.assertEquals("SEVENTY", wordNumberConverterService.convertToWord("70"));
		Assert.assertEquals("EIGHTY", wordNumberConverterService.convertToWord("80"));
		Assert.assertEquals("NINTY", wordNumberConverterService.convertToWord("90"));
		
	}
	@Test
	public void ConvertToWord_2_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("FIFTEEN", wordNumberConverterService.convertToWord("15"));
		Assert.assertEquals("ELEVEN", wordNumberConverterService.convertToWord("11"));
		Assert.assertEquals("TWENTY ONE", wordNumberConverterService.convertToWord("21").trim());
		Assert.assertEquals("TWENTY TWO", wordNumberConverterService.convertToWord("22").trim());
		Assert.assertEquals("THIRTY THREE", wordNumberConverterService.convertToWord("33").trim());
		Assert.assertEquals("FORTY FOUR", wordNumberConverterService.convertToWord("44").trim());
		Assert.assertEquals("FIFTY FIVE", wordNumberConverterService.convertToWord("55").trim());
		Assert.assertEquals("SIXTY SIX", wordNumberConverterService.convertToWord("66").trim());
		Assert.assertEquals("SEVENTY SEVEN", wordNumberConverterService.convertToWord("77").trim());
		Assert.assertEquals("EIGHTY EIGHT", wordNumberConverterService.convertToWord("88").trim());
		Assert.assertEquals("NINTY NINE", wordNumberConverterService.convertToWord("99").trim());
	}
	
	@Test
	public void ConvertToWord_HUNDREDS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE HUNDRED AND FIFTEEN", wordNumberConverterService.convertToWord("115"));
		Assert.assertEquals("ONE HUNDRED AND ELEVEN", wordNumberConverterService.convertToWord("111"));
		Assert.assertEquals("TWO HUNDRED AND TWENTY ONE", wordNumberConverterService.convertToWord("221").trim());
		Assert.assertEquals("TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.convertToWord("222").trim());
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.convertToWord("333").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.convertToWord("444").trim());
		Assert.assertEquals("FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.convertToWord("555").trim());
		Assert.assertEquals("SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.convertToWord("666").trim());
		Assert.assertEquals("SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.convertToWord("777").trim());
		Assert.assertEquals("EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.convertToWord("888").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE", wordNumberConverterService.convertToWord("999").trim());
	}
	
	@Test
	public void ConvertToWord_THOUSAND_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE THOUSAND ONE HUNDRED AND FIFTEEN", wordNumberConverterService.convertToWord("1115"));
		Assert.assertEquals("ONE THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.convertToWord("1111"));
		Assert.assertEquals("TWO THOUSAND TWO HUNDRED AND TWENTY ONE", wordNumberConverterService.convertToWord("2221").trim());
		Assert.assertEquals("TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.convertToWord("2222").trim());
		Assert.assertEquals("THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.convertToWord("3333").trim());
		Assert.assertEquals("FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.convertToWord("4444").trim());
		Assert.assertEquals("FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.convertToWord("5555").trim());
		Assert.assertEquals("SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.convertToWord("6666").trim());
		Assert.assertEquals("SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.convertToWord("7777").trim());
		Assert.assertEquals("EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.convertToWord("8888").trim());
		Assert.assertEquals("NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.convertToWord("9999").trim());
	}
	
	@Test
	public void ConvertToWord_THOUSANDS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ELEVEN THOUSAND ONE HUNDRED AND FIFTEEN", wordNumberConverterService.convertToWord("11115"));
		Assert.assertEquals("ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.convertToWord("11111"));
		Assert.assertEquals("TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY ONE", wordNumberConverterService.convertToWord("22221").trim());
		Assert.assertEquals("TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.convertToWord("22222").trim());
		Assert.assertEquals("THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.convertToWord("33333").trim());
		Assert.assertEquals("FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.convertToWord("44444").trim());
		Assert.assertEquals("FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.convertToWord("55555").trim());
		Assert.assertEquals("SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.convertToWord("66666").trim());
		Assert.assertEquals("SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.convertToWord("77777").trim());
		Assert.assertEquals("EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.convertToWord("88888").trim());
		Assert.assertEquals("NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.convertToWord("99999").trim());
	}
	@Test
	public void ConvertToWord_HUNDRED_THOUSANDS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE HUNDRED AND ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.convertToWord("111111"));
		Assert.assertEquals("TWO HUNDRED AND TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.convertToWord("222222").trim());
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.convertToWord("333333").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.convertToWord("444444").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.convertToWord("444444").trim());
		Assert.assertEquals("FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.convertToWord("555555").trim());
		Assert.assertEquals("SIX HUNDRED AND SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.convertToWord("666666").trim());
		Assert.assertEquals("SEVEN HUNDRED AND SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.convertToWord("777777").trim());
		Assert.assertEquals("EIGHT HUNDRED AND EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.convertToWord("888888").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.convertToWord("999999").trim());
	}
	
	@Test
	public void ConvertToWord_MILLION_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE MILLION ONE HUNDRED AND ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.convertToWord("1111111"));
		Assert.assertEquals("TWO MILLION TWO HUNDRED AND TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.convertToWord("2222222").trim());
		Assert.assertEquals("THREE MILLION THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.convertToWord("3333333").trim());
		Assert.assertEquals("FOUR MILLION FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.convertToWord("4444444").trim());
		Assert.assertEquals("FIVE MILLION FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.convertToWord("5555555").trim());
		Assert.assertEquals("SIX MILLION SIX HUNDRED AND SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.convertToWord("6666666").trim());
		Assert.assertEquals("SEVEN MILLION SEVEN HUNDRED AND SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.convertToWord("7777777").trim());
		Assert.assertEquals("EIGHT MILLION EIGHT HUNDRED AND EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.convertToWord("8888888").trim());
		Assert.assertEquals("NINE MILLION NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.convertToWord("9999999").trim());
	}
	
	@Test
	public void ConvertToWord_MILLIONS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ELEVEN MILLION ONE HUNDRED AND ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.convertToWord("11111111"));
		Assert.assertEquals("TWO HUNDRED AND TWENTY TWO MILLION TWO HUNDRED AND TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.convertToWord("222222222").trim());
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE MILLION THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.convertToWord("333333333").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR MILLION FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.convertToWord("444444444").trim());
		Assert.assertEquals("FIVE HUNDRED AND FIFTY FIVE MILLION FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.convertToWord("555555555").trim());
		Assert.assertEquals("SIX HUNDRED AND SIXTY SIX MILLION SIX HUNDRED AND SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.convertToWord("666666666").trim());
		Assert.assertEquals("SEVEN HUNDRED AND SEVENTY SEVEN MILLION SEVEN HUNDRED AND SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.convertToWord("777777777").trim());
		Assert.assertEquals("EIGHT HUNDRED AND EIGHTY EIGHT MILLION EIGHT HUNDRED AND EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.convertToWord("888888888").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE MILLION NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.convertToWord("999999999").trim());
	}
}
