package com.task;

import java.util.Scanner;

public class ArrayDemo {
	
	private Scanner scanner = new Scanner(System.in);
	
	int number = scanner.nextInt();
	
	int[] midsem = new int[number];
	
	int[] endsem = new int[number];
	
	int[] finalmark = new int[number];
	
	private void gciover() {
		
		
		System.out.println("Enter the number of arrays:");
		
		System.out.println("Enter the Array Element of the first set:");
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the number at index " + i+": ");
			scanner.nextInt();
		}
		System.out.println("Next Array Elements");
		for (int j = 0; j < number; j++) {
			System.out.println("Enter the number at index " + j + ": ");
			scanner.nextInt();
		}
		System.out.println("Computing Final Mark");
		for(int g=0; g<number;g++) {
			int sum = midsem[g]+endsem[g];
			System.out.println(sum);
		}
	}
	
}
