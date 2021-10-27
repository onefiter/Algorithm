package com.onefiter;

public class Main {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>(50);
//		System.out.println(list.size());
		list.add(10);
		list.add(99);
		list.add(88);
		list.add(77);
		list.add(66);
		list.add(55);
		list.add(44);
//		list.add(33);
		Integer value = 77;
		System.out.println(list.get(3));
		Asserts.test(list.get(3) == value);
		
//		for (int i = 0; i < 100; i++) {
//			list.add(i);
//		}
		
	}

}
