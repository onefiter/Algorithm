package com.onefiter;

import java.awt.PageAttributes.OriginType;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * ��Ŀ������һ���Ǹ���n�������0��n֮��ÿ�����ֵĶ�������ʽ��1�ĸ�����
 * �����һ�����顣
 * ���磬�����nΪ4������0��1��2��3��4�Ķ�������ʽ��1�ĸ����ֱ�Ϊ0��1��1��2��1������������[0��1��1��2��1]��
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
	
	//ʱ�临�Ӷ�ΪO(n)
	public static int[] countBits3(int num) {
		int[] result = new int[num + 1];
		for (int i = 1; i <= num; ++i) {
			result[i] = result[i >> 1] + (i & 1);
		}
		
		return result;
	}

	//ʱ�临�Ӷ�ΪO(n)
	public static int[] countBits2(int num) {
		int[] result = new int[num + 1];
		for (int i = 1; i <= num; ++i) {
			result[i] = result[i & (i-1)] + 1;
		}
		
		return result;
	}

	//ʱ�临�Ӷ�ΪO(kn) k=n+1
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
