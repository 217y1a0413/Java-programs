package com.codegnan.oopexamples;

public class Librarysystem {

	public static void main(String[] args) {
		Book b1=new Book();
		Book b2=new Book();
		b1.settitle("Harrypotter");
		b1.setauthor("J.K.Rowling");
		b1.setisavailable(true);
		
		b1.gettitle();
		b1.getauthor();
		b1.getisavailable();
		
		b2.settitle("The Friends");
		b2.setauthor("Ravali");
		b2.setisavailable(true);
		
		b2.gettitle();
		b2.getauthor();
		b2.getisavailable();
		
		System.out.println("book information :");
		b1.displayInfo();
		b2.displayInfo();
		
		System.out.println("Borrowing first book ");
		b1.borrowBook();
		b1.borrowBook();
		
		System.out.println("Borrowing first book ");
		b1.returnBook();
		b1.returnBook();
		
		System.out.println("Updated Information of first book");
		b1.displayInfo();
		
		
	
		

	}

}
