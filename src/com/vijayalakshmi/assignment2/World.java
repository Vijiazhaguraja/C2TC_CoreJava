package com.vijayalakshmi.assignment2;
import java.util.Scanner;

public class World {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your Fullname_with_initial:");
		String FullName_with_initial=input.nextLine();
		
		System.out.println("Enter your RollNo:");
		long RollNo=input.nextInt();
		input.nextLine();
		
		System.out.println("Enter your Grade:");
		String Grade=input.nextLine();
		
		System.out.println("Enter your Percentage:");
		int Percentage=input.nextInt();
		
		System.out.println(FullName_with_initial);
		System.out.println(RollNo);
		System.out.println(Grade);
		System.out.println(Percentage);
		input.close();
		
		

	}

}
