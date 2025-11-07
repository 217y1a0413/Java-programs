package com.codegnan.oopexamples;

import java.util.Scanner;

public class GreenHouseSchool {
	 String name;
	 int rollNo;
	 int grade;
	public GreenHouseSchool(String name, int rollNo, int grade) throws Exception {
		
		if(name.equals("null")||name.trim().isEmpty()) {
			//System.out.println("Name cannot be empty or null");
			throw new Exception("Name cannot be empty or null");
		}if(rollNo<=0) {
			//System.out.println("Roll Number must be positive");
			throw new Exception("Roll Number must be positive");
			
		}if(grade<1||grade>12) {
			//System.out.println("Grade should be between 1 to 12");
			throw new Exception("Grade should be between 1 to 12");
		}
	    this.name = name;
		this.rollNo = rollNo;
		this.grade = grade;
	}
	
	public String Showprofile() {
		return "Name : "+name+" Roll Number : "+rollNo+" Grade :"+grade;	
	
		}
	public static void main(String[] args)  {  //throws exception
		Scanner sc=new Scanner(System.in);
		try {
		String name=sc.nextLine();
		int roll=sc.nextInt();
		int grade=sc.nextInt();
		GreenHouseSchool g=new GreenHouseSchool(name,roll,grade);
		System.out.println(g.Showprofile());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
