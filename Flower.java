package com.codegnan.inheritance;

import java.util.Scanner;

 abstract class Flower1 {
	String type;
	public Flower1(String type) {
		super();
		this.type=type;
	}
	public abstract String getType();

}
class Rose extends Flower1{
	public Rose(String type) {
		super(type);
	}
	public String getType() {
		return "Red";
	}
	
}
class  Lily extends Flower1{
	public Lily(String type) {
		super(type);
	}
	public String getType() {
		return "White";
	}
}
public class Flower{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the type of Flower :");
	String type=sc.nextLine();
	if(type.equalsIgnoreCase("Rose")) {
		Flower1 f=new Rose(type);
		System.out.println(f.getType());
	}
	if(type.equalsIgnoreCase("Lily")) {
		Flower1 f1=new Lily(type);
		System.out.println(f1.getType());
		
	}
	sc.close();
	
}
}



