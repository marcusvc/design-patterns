package edu.marcus.designpatterns.creational.builder;

import edu.marcus.designpatterns.creational.builder.HouseBuilder.House;
import edu.marcus.designpatterns.creational.builder.HouseDTOBuilder.HouseDTO;

public class DemoDTOBuilder {

	public static void main(String[] args) {

		HouseBuilder builder = new HouseBuilder();
		HouseDTOBuilder dtoBuilder;

		House house = builder.build();
		System.out.println(house);
		dtoBuilder = new HouseDTOBuilder(house);
		HouseDTO dto = dtoBuilder.build();
		System.out.println(dto);

		house = builder
				.setBedroom(2)
				.setKitchen(1)
				.setLivingroom(1)
				.setRestroom(1)
				.build();
		System.out.println(house);
		dtoBuilder = new HouseDTOBuilder(house);
		dto = dtoBuilder.build();
		System.out.println(dto);
		dto = dtoBuilder
				.setBedroom()
				.setRestroom()
				.build();
		System.out.println(dto);

	}

}
