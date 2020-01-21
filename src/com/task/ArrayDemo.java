package com.task;

import java.util.Scanner;

public class ArrayDemo {
	
	private Scanner scanner = new Scanner(System.in);
	
	private void gciover() {
		
		System.out.println("Enter the number of arrays:");
		int number =scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the number at index " + i + ": ");
			scanner.nextInt();
		}
		
	}
	
}
