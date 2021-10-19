package com.onefiter;

import java.util.Iterator;

/**
 * ����һ���ַ�������words������㲻������ͬ�ַ��������ַ���words[i]��words[j]�ĳ��ȳ˻������ֵ��
 * ��������ַ�������������һ����ͬ�ַ�����ô����0��
 * �����ַ�����ֻ����Ӣ��Сд��ĸ��
 * ���磬������ַ�������wordsΪ["abcw"��"foo"��"bar"��"fxyz"��"abcdef"]�������е��ַ���"bar"��"foo"û����ͬ���ַ���
 * ���ǳ��ȵĳ˻�Ϊ9��"abcw"��"fxyz"Ҳû����ͬ���ַ������ǳ��ȵĳ˻�Ϊ16�����Ǹ����鲻������ͬ�ַ���һ���ַ����ĳ��ȳ˻������ֵ
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
