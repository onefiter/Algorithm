package com.onefiter;

import java.util.Iterator;

/**
 * 输入一个字符串数组words，请计算不包含相同字符的两个字符串words[i]和words[j]的长度乘积的最大值。
 * 如果所有字符串都包含至少一个相同字符，那么返回0。
 * 假设字符串中只包含英文小写字母。
 * 例如，输入的字符串数组words为["abcw"，"foo"，"bar"，"fxyz"，"abcdef"]，数组中的字符串"bar"与"foo"没有相同的字符，
 * 它们长度的乘积为9。"abcw"与"fxyz"也没有相同的字符，它们长度的乘积为16，这是该数组不包含相同字符的一对字符串的长度乘积的最大值
 * @author onefiter
 *
 */
public class Main {

	public static void main(String[] args) {
		String[] wordStrings = {"abcw","foo","bar", "fxyz", "abcdef"};
	    int result = maxProduct(wordStrings);
	    System.out.println(result);
	}
	public static int maxProduct(String[] words) {
		boolean[][] flags = new boolean[words.length][26];
		for (int i = 0; i < words.length; i++) {
			for(char c: words[i].toCharArray()){
				flags[i][c - 'a'] = true;
			}
		}
		
		int result = 0;
		for (int i = 0; i < words.length; i++) {
			for(int j = i + 1; j < words.length; j++){
				int k = 0;
				for(; k < 26; k++) {
					if (flags[i][k] && flags[j][k]) {
						break;
					}
				}
				if (k == 26) {
					int prod = words[i].length() * words[j].length();
					result = Math.max(result, prod);
				}
			}
		}
		
		return result;
	}

}
