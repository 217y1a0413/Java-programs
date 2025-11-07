package com.codegnan.oopexamples;

public class VehicleMileage {
	String vehicleNo;
	String brand;
	double fuelConsumed;
	double distanceTravelled;
	double mileage;
	public VehicleMileage() {
		this("unknown","unknown");
	}
	public VehicleMileage(String vehicleNo, String brand) {
		this(vehicleNo,brand,0.0);
	}
	public VehicleMileage(String vehicleNo, String brand, double fuelConsumed) {
		this(vehicleNo,brand,fuelConsumed,0.0);
	}
	public VehicleMileage(String vehicleNo, String brand, double fuelConsumed, double distanceTravelled) {
		mileage=distanceTravelled/fuelConsumed;
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.fuelConsumed = fuelConsumed;
		this.distanceTravelled = distanceTravelled;
	}
	public void displayInfo() {
	System.out.println("Vehicle Number : " +vehicleNo);
	 System.out.println("Brand : " +brand);
	 System.out.println("Fuel Consumed : " +fuelConsumed);
	 System.out.println("Distance Travelled: " +distanceTravelled);
	 System.out.println("Mileage : " +mileage+" km/l");
}
public static void main(String[] args) {
	 VehicleMileage v=new VehicleMileage("KA01MH1234","Tata",18.0,324.0);
	 v.displayInfo();
}

	
	
	

}
