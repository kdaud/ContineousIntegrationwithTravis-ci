package com.patients.codes;

import java.util.Date;

public class Main {
	
	static {
		System.out.println("I LOVE JAVA CODING");
	}
	
	public static void main(String[] args) {
		Maths obj = new Maths();
		obj.setDate(new Date());
		System.out.println(obj.getDate());
		System.out.println(Math.subtractExact(17, 7));
	}
	
}
