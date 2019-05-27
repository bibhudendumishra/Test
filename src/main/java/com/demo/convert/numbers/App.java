package com.demo.convert.numbers;

import java.util.Scanner;

import com.demo.convert.numbers.exception.NumberExceptionMessage;
import com.demo.convert.numbers.exception.NumberRuntimeException;
import com.demo.convert.numbers.facade.WordConverter;
import com.demo.convert.numbers.facade.impl.WordConverterService;
/**
* Here is the main  . . .
* 
* 
* @author Bibhu Mishra
* 
*/
public class App 
{
    public static void main( String[] args )
    {
    	Scanner  console = new Scanner(System.in);
    	try {
    		while(true) {
		    	
				    	System.out.println("Please Enter a Number:");
				    	
				    	WordConverter wordConverterService = new WordConverterService();
					    	System.out.println();
					    	System.out.println();
					    	String number = console.nextLine();
					    	System.out.println(number + " = " + wordConverterService.convertToWord(number));
	    	}
	    
		}catch(NumberExceptionMessage ex) {
			System.out.println(ex.getMessage());
		} catch(NumberRuntimeException ex) {
			System.out.println(ex.getMessage());
		}
    	
    	finally {
    		console.close();
    	}
    }
}
