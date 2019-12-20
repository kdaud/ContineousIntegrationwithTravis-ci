package com.opensource.software;

import java.math.BigInteger;
import java.util.Scanner;

public class Fanabaci {
	
	/**
	 * kdaud
	 */
	public static void main(String[] args) {
		
		System.out.println("Type in index of fibonacci sequence:");
		
		int seq = 0;
		Scanner sc = new Scanner(System.in);
		
		seq = sc.nextInt();
		
		if (seq < 2000)
			System.out.println(fibo(seq));
		else
			System.out.println("Input Error");
	}
	
	public static BigInteger fibo(int n) {
		
		BigInteger num1 = new BigInteger("0");
		BigInteger num2 = new BigInteger("1");
		
		for (int i = 1; i < n; i++) {
			BigInteger sum;
			sum = num1.add(num2);
			num1 = num2;
			num2 = sum;
		}
		return num1;
	}
}
