package com.onefiter;

import java.util.Arrays;
import java.util.Iterator;

/**
 * ��Ŀ������һ���������飬������ֻ��һ�����ֳ�����һ�Σ����������ֶ�������3�Ρ����ҳ��Ǹ�ֻ����һ�ε����֡����磬������������Ϊ[0��1��0��1��0��1��100]����ֻ����һ�ε�������100��
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
