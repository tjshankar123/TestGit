package com.firstClass;

import java.util.Scanner;

public class newFile {

	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine().toLowerCase());
		in.close();	
	}

}
