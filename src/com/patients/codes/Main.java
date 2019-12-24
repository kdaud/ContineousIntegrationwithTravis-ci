package com.patients.codes;

import java.util.Date;

public class Main {
	
	final String ORGANISATION = "OPENMRS";
	
	static {
		System.out.println("I LOVE JAVA CODING");
	}
	
	public static void main(String[] args) {
		Maths obj = new Maths();
		obj.setDate(new Date());
		System.out.println(obj.getDate());
		System.out.println(Math.subtractExact(17, 7));
		System.out.println("Am volunteering with OpenMRS");
		sum(40, 42);
	}
	
	public static void sum(int c, int u) {
		System.out.println(c + u);
		System.out.println(Math.sin(90));
	}
	
}
