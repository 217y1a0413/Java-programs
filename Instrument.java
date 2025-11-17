package com.codegnan.inheritance;

import java.util.Scanner;

abstract class Instrument1 {
	String type;
	public Instrument1(String type) {
		super();
		this.type=type;
	}
	public abstract String getSound();

}
class Guitar extends Instrument1{
	public Guitar(String type) {
		super(type);
	}
	public String getSound() {
		return "Strum";
	}
	
}
class  Drum extends Instrument1{
	public Drum(String type) {
		super(type);
	}
	public String getSound() {
		return "Beat";
	}
}
public class Instrument{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the type of Instrument :");
	String type=sc.nextLine();
	if(type.equalsIgnoreCase("Guitar")) {
		Instrument1 i=new Guitar(type);
		System.out.println(i.getSound());
	}
	if(type.equalsIgnoreCase("Drum")) {
		Instrument1 i1=new Drum(type);
		System.out.println(i1.getSound());
		
	}
	sc.close();
	
}
}
