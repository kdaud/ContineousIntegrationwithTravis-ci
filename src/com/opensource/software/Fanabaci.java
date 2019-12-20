package com.opensource.software;

import java.util.Scanner;

public class Fanabaci {
	
	/**
	 * kdaud
	 */
	static {
		System.out.println("Fanabaci Sequence");
	}
	public static void main(String[] args) {
		

		System.out.println("Type in index of fibbonaci sequence:");
		
		int seq = 0;
		Scanner sc = new Scanner(System.in);
		seq = sc.nextInt();
		
		System.out.println(fib(seq));
	}
	
	public static int fib(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
		
	}
	
}
