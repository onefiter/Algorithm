package com.onefiter;



public class Main {

	/**
	 * 斐波那契数列
	 * 0 1 1 2 3 5 8 13 21 ...
	 */
	
	public static void main(String[] args) {
	
		System.out.println(fib1(6));
		System.out.println(fib1(6));
		System.out.println(fib1(6));
	}
	
	/**
	 * 时间复杂度为O(2^n)
	 * @param n
	 * @return
	 */
	public static int fib1(int n) {
		if (n <= 1) {
			return n;
		}
		
		return fib1(n - 1) + fib1(n - 2);
			
	}
	
	public static int fib2(int n) {
		if (n <= 1) {
			return n;
		}
		int first = 0;
		int second = 1;
		for (int i = 0; i < n - 1; i++) {
			int sum = 0;
			sum = first + second;
			first = second;
			second = sum;
			
		}
		
		return second;
	}
	
	public static int fib3(int n) {
		if (n <= 1) {
			return n;
		}
		int first = 0;
		int second = 1;
		for (int i = 0; i < n - 1; i++) {
	
			second = first + second;
			first = second - first;
			
		}
		
		return second;
	}

}
