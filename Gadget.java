package com.codegnan.inheritance;

import java.util.Scanner;

 abstract class Gadget1 {
	String name;
	public Gadget1(String name) {
		super();
		this.name=name;
	}
	public abstract String getUse();

}
class Phone extends Gadget1{
	public Phone(String name) {
		super(name);
	}
	public String getUse() {
		return "Call";
	}
	
}
class  Laptop extends Gadget1{
	public Laptop(String name) {
		super(name);
	}
	public String getUse() {
		return "Work";
	}
}
public class Gadget{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name of Gadget :");
	String name=sc.nextLine();
	if(name.equalsIgnoreCase("Phone")) {
		Gadget1 g=new Phone(name);
		System.out.println(g.getUse());
	}
	if(name.equalsIgnoreCase("Laptop")) {
		Gadget1 g1=new Laptop(name);
		System.out.println(g1.getUse());
		
	}
	sc.close();
	
}
}



