package com.dev.core.java;

public class EW {
	int i = 10;
	public void disp() {
		System.out.println("top");
	}
	public void m1() {
		System.out.println("EW class");
	}
}

class WE extends EW {
	
	public void disp() {
		i = 50;
		System.out.println(i);
		System.out.println("bottom");
	}
	public void m2() {
		System.out.println("WE class");
	}

	public static void main(String[] args) {

		EW we = new  WE();
		System.out.println(we.i);
		WE ee = (WE) we;
		we.disp();
		ee.m2();
		System.out.println(32768*32768*2);		
	}
	
	
}
