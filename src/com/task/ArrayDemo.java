package com.task;

import java.util.Scanner;

public class ArrayDemo {
	
	private Scanner scanner = new Scanner(System.in);
	
	private void gciover() {
		
		System.out.println("Enter the number of arrays:");
		int number =scanner.nextInt();
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
	}
	
}
