package com.cg.exception;

public class ExceptionDemo {

	public static void checkNumber(int n) {
		
		if(n <= 0) {
			throw new InvalidValueException();
		}
	}
		
	
	public static void main(String[] args) {
		int n=-23; 
		
		
		try {
		
			checkNumber(n);
			
		}
		catch(InvalidValueException ie) {
			System.out.println(ie);
		}
		
		System.out.println("Program over");

		}
	}



