package com.demo.convert.numbers.facade.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.facade.NumberToWordFacade;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class WordConverterServiceTest_SUCCESS {
	
	@InjectMocks
	NumberToWordFacade wordNumberConverterService = new NumberToWordFacade();
	
	@Test
	public void ConvertToWording_1_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		
		Assert.assertEquals("ZERO", wordNumberConverterService.ConvertToWording("0"));
		Assert.assertEquals("NINE", wordNumberConverterService.ConvertToWording("9"));
		Assert.assertEquals("TEN", wordNumberConverterService.ConvertToWording("10"));
		Assert.assertEquals("TWENTY", wordNumberConverterService.ConvertToWording("20"));
		Assert.assertEquals("THIRTY", wordNumberConverterService.ConvertToWording("30"));
		Assert.assertEquals("FORTY", wordNumberConverterService.ConvertToWording("40"));
		Assert.assertEquals("FIFTY", wordNumberConverterService.ConvertToWording("50"));
		Assert.assertEquals("SIXTY", wordNumberConverterService.ConvertToWording("60"));
		Assert.assertEquals("SEVENTY", wordNumberConverterService.ConvertToWording("70"));
		Assert.assertEquals("EIGHTY", wordNumberConverterService.ConvertToWording("80"));
		Assert.assertEquals("NINTY", wordNumberConverterService.ConvertToWording("90"));
		
	}
	@Test
	public void ConvertToWording_2_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("FIFTEEN", wordNumberConverterService.ConvertToWording("15"));
		Assert.assertEquals("ELEVEN", wordNumberConverterService.ConvertToWording("11"));
		Assert.assertEquals("TWENTY ONE", wordNumberConverterService.ConvertToWording("21").trim());
		Assert.assertEquals("TWENTY TWO", wordNumberConverterService.ConvertToWording("22").trim());
		Assert.assertEquals("THIRTY THREE", wordNumberConverterService.ConvertToWording("33").trim());
		Assert.assertEquals("FORTY FOUR", wordNumberConverterService.ConvertToWording("44").trim());
		Assert.assertEquals("FIFTY FIVE", wordNumberConverterService.ConvertToWording("55").trim());
		Assert.assertEquals("SIXTY SIX", wordNumberConverterService.ConvertToWording("66").trim());
		Assert.assertEquals("SEVENTY SEVEN", wordNumberConverterService.ConvertToWording("77").trim());
		Assert.assertEquals("EIGHTY EIGHT", wordNumberConverterService.ConvertToWording("88").trim());
		Assert.assertEquals("NINTY NINE", wordNumberConverterService.ConvertToWording("99").trim());
	}
	
	@Test
	public void ConvertToWording_HUNDREDS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE HUNDRED AND FIFTEEN", wordNumberConverterService.ConvertToWording("115"));
		Assert.assertEquals("ONE HUNDRED AND ELEVEN", wordNumberConverterService.ConvertToWording("111"));
		Assert.assertEquals("TWO HUNDRED AND TWENTY ONE", wordNumberConverterService.ConvertToWording("221").trim());
		Assert.assertEquals("TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.ConvertToWording("222").trim());
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.ConvertToWording("333").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.ConvertToWording("444").trim());
		Assert.assertEquals("FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.ConvertToWording("555").trim());
		Assert.assertEquals("SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.ConvertToWording("666").trim());
		Assert.assertEquals("SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.ConvertToWording("777").trim());
		Assert.assertEquals("EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.ConvertToWording("888").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE", wordNumberConverterService.ConvertToWording("999").trim());
	}
	
	@Test
	public void ConvertToWording_THOUSAND_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE THOUSAND ONE HUNDRED AND FIFTEEN", wordNumberConverterService.ConvertToWording("1115"));
		Assert.assertEquals("ONE THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.ConvertToWording("1111"));
		Assert.assertEquals("TWO THOUSAND TWO HUNDRED AND TWENTY ONE", wordNumberConverterService.ConvertToWording("2221").trim());
		Assert.assertEquals("TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.ConvertToWording("2222").trim());
		Assert.assertEquals("THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.ConvertToWording("3333").trim());
		Assert.assertEquals("FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.ConvertToWording("4444").trim());
		Assert.assertEquals("FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.ConvertToWording("5555").trim());
		Assert.assertEquals("SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.ConvertToWording("6666").trim());
		Assert.assertEquals("SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.ConvertToWording("7777").trim());
		Assert.assertEquals("EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.ConvertToWording("8888").trim());
		Assert.assertEquals("NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.ConvertToWording("9999").trim());
	}
	
	@Test
	public void ConvertToWording_THOUSANDS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ELEVEN THOUSAND ONE HUNDRED AND FIFTEEN", wordNumberConverterService.ConvertToWording("11115"));
		Assert.assertEquals("ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.ConvertToWording("11111"));
		Assert.assertEquals("TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY ONE", wordNumberConverterService.ConvertToWording("22221").trim());
		Assert.assertEquals("TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.ConvertToWording("22222").trim());
		Assert.assertEquals("THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.ConvertToWording("33333").trim());
		Assert.assertEquals("FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.ConvertToWording("44444").trim());
		Assert.assertEquals("FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.ConvertToWording("55555").trim());
		Assert.assertEquals("SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.ConvertToWording("66666").trim());
		Assert.assertEquals("SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.ConvertToWording("77777").trim());
		Assert.assertEquals("EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.ConvertToWording("88888").trim());
		Assert.assertEquals("NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.ConvertToWording("99999").trim());
	}
	@Test
	public void ConvertToWording_HUNDRED_THOUSANDS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE HUNDRED AND ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.ConvertToWording("111111"));
		Assert.assertEquals("TWO HUNDRED AND TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.ConvertToWording("222222").trim());
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.ConvertToWording("333333").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.ConvertToWording("444444").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.ConvertToWording("444444").trim());
		Assert.assertEquals("FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.ConvertToWording("555555").trim());
		Assert.assertEquals("SIX HUNDRED AND SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.ConvertToWording("666666").trim());
		Assert.assertEquals("SEVEN HUNDRED AND SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.ConvertToWording("777777").trim());
		Assert.assertEquals("EIGHT HUNDRED AND EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.ConvertToWording("888888").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.ConvertToWording("999999").trim());
	}
	
	@Test
	public void ConvertToWording_MILLION_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ONE MILLION ONE HUNDRED AND ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.ConvertToWording("1111111"));
		Assert.assertEquals("TWO MILLION TWO HUNDRED AND TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.ConvertToWording("2222222").trim());
		Assert.assertEquals("THREE MILLION THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.ConvertToWording("3333333").trim());
		Assert.assertEquals("FOUR MILLION FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.ConvertToWording("4444444").trim());
		Assert.assertEquals("FIVE MILLION FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.ConvertToWording("5555555").trim());
		Assert.assertEquals("SIX MILLION SIX HUNDRED AND SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.ConvertToWording("6666666").trim());
		Assert.assertEquals("SEVEN MILLION SEVEN HUNDRED AND SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.ConvertToWording("7777777").trim());
		Assert.assertEquals("EIGHT MILLION EIGHT HUNDRED AND EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.ConvertToWording("8888888").trim());
		Assert.assertEquals("NINE MILLION NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.ConvertToWording("9999999").trim());
	}
	
	@Test
	public void ConvertToWording_MILLIONS_SUCCESS_TEST() throws NumberRuntimeException, NumberExceptionMessage {
		Assert.assertEquals("ELEVEN MILLION ONE HUNDRED AND ELEVEN THOUSAND ONE HUNDRED AND ELEVEN", wordNumberConverterService.ConvertToWording("11111111"));
		Assert.assertEquals("TWO HUNDRED AND TWENTY TWO MILLION TWO HUNDRED AND TWENTY TWO THOUSAND TWO HUNDRED AND TWENTY TWO", wordNumberConverterService.ConvertToWording("222222222").trim());
		Assert.assertEquals("THREE HUNDRED AND THIRTY THREE MILLION THREE HUNDRED AND THIRTY THREE THOUSAND THREE HUNDRED AND THIRTY THREE", wordNumberConverterService.ConvertToWording("333333333").trim());
		Assert.assertEquals("FOUR HUNDRED AND FORTY FOUR MILLION FOUR HUNDRED AND FORTY FOUR THOUSAND FOUR HUNDRED AND FORTY FOUR", wordNumberConverterService.ConvertToWording("444444444").trim());
		Assert.assertEquals("FIVE HUNDRED AND FIFTY FIVE MILLION FIVE HUNDRED AND FIFTY FIVE THOUSAND FIVE HUNDRED AND FIFTY FIVE", wordNumberConverterService.ConvertToWording("555555555").trim());
		Assert.assertEquals("SIX HUNDRED AND SIXTY SIX MILLION SIX HUNDRED AND SIXTY SIX THOUSAND SIX HUNDRED AND SIXTY SIX", wordNumberConverterService.ConvertToWording("666666666").trim());
		Assert.assertEquals("SEVEN HUNDRED AND SEVENTY SEVEN MILLION SEVEN HUNDRED AND SEVENTY SEVEN THOUSAND SEVEN HUNDRED AND SEVENTY SEVEN", wordNumberConverterService.ConvertToWording("777777777").trim());
		Assert.assertEquals("EIGHT HUNDRED AND EIGHTY EIGHT MILLION EIGHT HUNDRED AND EIGHTY EIGHT THOUSAND EIGHT HUNDRED AND EIGHTY EIGHT", wordNumberConverterService.ConvertToWording("888888888").trim());
		Assert.assertEquals("NINE HUNDRED AND NINTY NINE MILLION NINE HUNDRED AND NINTY NINE THOUSAND NINE HUNDRED AND NINTY NINE", wordNumberConverterService.ConvertToWording("999999999").trim());
	}
}
