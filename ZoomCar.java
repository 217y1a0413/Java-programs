package com.codegnan.oopexamples;

import java.util.Scanner;

public class ZoomCar {
	String brand;
	String model;
	double price;
	
	
	public ZoomCar(String brand, String model, double price) throws Exception {
		if(brand.equals("null")||brand.trim().isEmpty()) {
			throw new Exception("Brand should not be Empty");
			}
		if(model.equals("null")||model.trim().isEmpty()) {
			throw new Exception("model should not be Empty");
				}
		if(price<=0.0) {
			throw new Exception(" Rental Price should be positive");
		}
		
		this.brand = brand;
		this.model = model;
		this.price = price;
	
	}
	public String displayCarInfo() {
		return "Brand : "+brand+" Model : "+model+" Price :"+price;
	}
public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	try {
	String brand=sc.nextLine();
	String model=sc.nextLine();
	double price=sc.nextDouble();
	ZoomCar z=new ZoomCar(brand,model,price);
	System.out.println(z.displayCarInfo());
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	sc.close();
	
}

	
}
