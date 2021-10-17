package com.onefiter;



public class Main {

	public static void main(String[] args) {
	
		int dividend = 10;
		int divisor = 2;
		System.out.println(divide(dividend, divisor));
	}
	
	public static int divide(int dividend, int divisor) {
		if (dividend == 0x80000000 && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		
		int negative = 2;
		if (dividend > 0) {
			dividend = -dividend;
			negative--;
		}
		
		if (divisor > 0) {
			divisor = -divisor;
			negative--;
		}
		
		int result = divideCore(dividend, divisor);
		return negative > 2 ? -result :result;
	}
	
	private static int divideCore(int dividend, int divisor) {
		int result = 0;
		while(dividend <= divisor) {
			int value = divisor;
			int quotient = 1;
			while (value >= 0xc0000000 && dividend <= value +value) {
				quotient += quotient;
				value += value;
			}
			result += quotient;
			dividend -= value;
		}
		return result;
	} 

}
