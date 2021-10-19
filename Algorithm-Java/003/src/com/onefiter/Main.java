package com.onefiter;

import java.awt.PageAttributes.OriginType;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 题目：输入一个非负数n，请计算0到n之间每个数字的二进制形式中1的个数，
 * 并输出一个数组。
 * 例如，输入的n为4，由于0、1、2、3、4的二进制形式中1的个数分别为0、1、1、2、1，因此输出数组[0，1，1，2，1]。
 * @author onefiter
 *
 */
public class Main {

	public static void main(String[] args) {
		int n = 4;
		
		System.out.println(Arrays.toString(countBits1(n)));
		System.out.println(Arrays.toString(countBits2(n)));
		System.out.println(Arrays.toString(countBits3(n)));
	
	}
	
	//时间复杂度为O(n)
	public static int[] countBits3(int num) {
		int[] result = new int[num + 1];
		for (int i = 1; i <= num; ++i) {
			result[i] = result[i >> 1] + (i & 1);
		}
		
		return result;
	}

	//时间复杂度为O(n)
	public static int[] countBits2(int num) {
		int[] result = new int[num + 1];
		for (int i = 1; i <= num; ++i) {
			result[i] = result[i & (i-1)] + 1;
		}
		
		return result;
	}

	//时间复杂度为O(kn) k=n+1
	public static int[] countBits1(int num) {
		int[] result = new int[num + 1];
		for (int i = 0; i <= num; ++i) {
			int j = i;
			while (j != 0){
				result[i]++; 
				j = j & (j - 1 );
			}
		}
		
		return result;
	}

}
