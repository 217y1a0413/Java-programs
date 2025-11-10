package com.codegnan.oopexamples;

public class Box_01 {

	
		//instance varaiables
		static double width;
		static double height;
		static double depth;
		
	public Box_01() {
			super();
			// TODO Auto-generated constructor stub
		}

	public  static double volume(double height, double width,double depth){
			//System.out.print("Volume :");
			//System.out.println(height*width*depth);
		return height*width*depth;
			
			}
	
	public static void main(String[] args) {
		//Box_01 b=new Box_01();
		System.out.println(Box_01.volume(3.0,5.0,10.0));//we use static we can class variables by using class name

	}

}
