package com.codegnan.oopexamples;

public class LibraryFineDue {
	int id;
	String type;
	
	public LibraryFineDue(int id) {
		super();
		this.id = id;
	}
	
	public LibraryFineDue(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public int fine(int days) {
		int fine=days*5;
		return Math.min(fine, 1000);
	
	}
	public int fine(int days,String type) {
		int fine = 0;
		if(type.equalsIgnoreCase("regular")) {
			 fine=days*2;
	
			
		}else {
			if(type.equalsIgnoreCase("premium")) {
				fine=days*3;
				
			}
			
		}
		return Math.min(fine,1000);
		
		
		
	}
	public int fine(int days,int fixedConstant) {
		int fine=days*5+fixedConstant;
		return Math.min(fine,1000);
	}
	public int getId() {
		return id;
	}
}

	
