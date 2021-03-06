package com.onefiter;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 题目：输入一个整数数组，数组中只有一个数字出现了一次，而其他数字都出现了3次。请找出那个只出现一次的数字。例如，如果输入的数组为[0，1，0，1，0，1，100]，则只出现一次的数字是100。
 * @author onefiter
 *
 */
public class Main {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 1, 0, 1, 100};
		System.out.println(singleNumber(nums));	
	}
	
	
	private static int singleNumber(int[] nums) {
		int[] bitSums = new int[32];
		for (int num : nums) {
			for(int i = 0; i < 32; i++ ) {
				bitSums[i] += (num >> (31 - i)) & 1;
			}
		}
		
		int result = 0;
		for(int i = 0; i < 32; i++ ) {
			result = (result << 1 ) + bitSums[i] % 3;
		}
		return result;
	}
}
