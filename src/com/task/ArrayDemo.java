package com.task;

import java.util.Scanner;

public class ArrayDemo {
	
	static {
		System.out.println("Enter the number of arrays:");
	}
	
	private Scanner scanner = new Scanner(System.in);
	
	int number = scanner.nextInt();
	
	int[] midsem = new int[number];
	
	int[] endsem = new int[number];
	
	int[] finalmark = new int[number];
	
	protected void gciover() {
		
		

		
		System.out.println("Enter the Array Element of the first set:");
		System.out.println("------------------------");
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the number at index " + i+": ");
			midsem[i] = scanner.nextInt();
		}
		System.out.println("-------------------");
		System.out.println("Next Array Elements");
		for (int j = 0; j < number; j++) {
			System.out.println("Enter the number at index " + j + ": ");
			endsem[j] = scanner.nextInt();
		}
		System.out.println("-------------------");
		System.out.println("Computing Final Mark");
		for(int g=0; g<number;g++) {
			finalmark[g] = midsem[g] + endsem[g];
			System.out.print(finalmark[g] + " ");
		}
	}
	
}
