package edu.marcus.designpatterns.creational.builder;

import edu.marcus.designpatterns.creational.builder.HouseBuilder.House;

public class DemoBuilder {
	
	public static void main(String[] args) {
		
		HouseBuilder builder = new HouseBuilder();
		
		House house = builder.build();
		System.out.println(house);
		
		house = builder
				.setBedroom(2)
				.setKitchen(1)
				.setLivingroom(1)
				.setRestroom(1)
				.build();
		System.out.println(house);
		
		house = builder
				.setBedroom(3)
				.setKitchen(1)
				.setLivingroom(1)
				.setRestroom(2)
				.setGarage(1)
				.setBackyard(1)
				.build();
		System.out.println(house);
		
	}

}
