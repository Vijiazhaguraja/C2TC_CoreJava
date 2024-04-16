package com.vijayalakshmi.assignment2;

public class Main {

	public static void main(String[] args) {
		Studentdetails course=new Studentdetails();
		Commision commission=new Commision();
		commission.AcceptDetails_Employee("viji","23 puliangudi",123456789,89000);
		double commsionAmount=commission.CalculateCommission();
		System.out.println("Commission amount:$"+commsionAmount);
		
		
		
	}

}
