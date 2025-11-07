package com.codegnan.oopexamples;

public class StudentMarks_01 {
	String name;
	int[] marks;
	
	

	public  void setDetails(String name, int[] marks) {
		this.name = name;
		/*this.marks[0] = marks[0];
		this.marks[1] = marks[1];
		this.marks[2] = marks[2];
		this.marks[3] = marks[3];*/
		this.marks=marks;
		
		
	}
	
	public double calculateTotal() {
		return marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
		
	}
	public double calculateAverage() {
		return (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
	}
    public void displayDetails() {
    	System.out.println("Student Name :"+name);
    	System.out.println("Marks : "+marks[0]+" , "+marks[1]+" , "+marks[2]+" , "+marks[3]+" , "+marks[4]);
    	System.out.println("Total Marks : "+calculateTotal());
    	System.out.println("Average Marks :"+calculateAverage());
    	
    }


	public static void main(String[] args) {
		int[] marks= {12,40,56,78,98};
		StudentMarks_01 sm=new StudentMarks_01();
		sm.setDetails("chandu",marks);
		System.out.println(sm.calculateTotal());
		System.out.println(sm.calculateAverage());
		sm.displayDetails();
		
		
		
		
		

	}

}
