package com.codegnan.oopexamples;

public class Book {
	private String title;
	private String author;
	private boolean isAvailable;
	public void settitle(String title) {
		this.title=title;
	}
	public String gettitle() {
		return title;
	}
	public void setauthor(String author) {
		this.author=author;
	}
	 public String getauthor() {
		 return author;
	 }
	 public void setisavailable(boolean isAvailable) {
		 this.isAvailable=true;
		}
	 public boolean getisavailable() {
		 return isAvailable;
	 }
	 public void borrowBook() {
		 if(isAvailable) {
			 isAvailable=true;
			 System.out.println("The book " +title+ " with the author " +author+ "is available");
		 }else {
			 System.out.println("Sorry ! The book " +title+ " with the author " +author+ "is borrowed ");
			 
		 }
	 }
	 
	 public void returnBook() {
		 if(isAvailable) {
			 isAvailable=false;
			 System.out.println("The book " +title+ " with the author " +author+ " is already borrowed");
		 }else {
			 System.out.println("The book " +title+ " with the author " +author+ " is  available ");
			 
		 }
	 }
	 public void displayInfo() {
		 System.out.println("The title of the book : " +title);
		 System.out.println("The Author of the book : " +author);
		 System.out.println("The Availability of the book : " +isAvailable);
	 }
}
			 
		
			 
		 
		 
	 
		
		
	
	
	
	




/*In your main method (LibrarySystem class):


Create two Book objects with different titles and authors.
Display the information of both books.
Borrow the first book and try to borrow it again (to test availability logic).
Return the first book and try to return it again (to test return logic).
Finally, display the updated information of the first book.*/

