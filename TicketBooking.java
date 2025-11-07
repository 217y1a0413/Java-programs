package com.codegnan.oopexamples;

import java.util.Scanner;

public class TicketBooking {
	int ticketCost=500;
	int ticketCount;

	

	public TicketBooking(int ticketCount) {
		/*if(ticketCount<0) {
			throw new Exception("Error Message");
		}*/
		if(ticketCount<0) {
			System.out.println("Error Message");
		}
		this.ticketCount = ticketCount;
	}
	
	public double TotalCost() {
			 return ticketCount*ticketCost;
		
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//try {
		System.out.println("Enter the Ticket Count :");
		int count=sc.nextInt();
		TicketBooking tb=new TicketBooking(count);
		System.out.println(tb.TotalCost());
		
		/*catch (Exception e) {
			System.out.println("error : "+e.getMessage());
		}*/
		
		
		sc.close();
		
		

	}

}
