package com.codegnan.oopexamples;

import java.util.Scanner;

public class Gym {
	int steps;
	public Gym(int steps) {
		this.steps=steps;
	}
	public void display() {
		if(steps>=10000) {
			System.out.println("Excellent Job");
			
		}else if(steps>=5000 ) {
			System.out.println("Good Job");
			
		}else{
			System.out.println("keep going");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the steps :");
		int steps=sc.nextInt();
		/*if(steps<=10000) {
			System.out.println("Excellent Job");
			
		}if(steps>5000 && steps<10000) {
			System.out.println("Good Job");
			
		}System.out.println("keep going");*/
		Gym g=new Gym(steps);
		g.display();
		sc.close();
		
		

	}

}
