package edu.marcus.designpatterns.creational.builder;

import edu.marcus.designpatterns.creational.builder.HouseBuilder.House;

public class HouseDTOBuilder {
	
	private House house;
	private int bedroom;
	private int restroom;
	private int livingroom;
	private int garage;
	private int backyard;
	private int kitchen;
	
	public HouseDTOBuilder(House house) {
		this.house = house;
	}
	
	public HouseDTOBuilder setBedroom() {
		this.bedroom = this.house.getBedroom();
		return this;
	}
	
	public HouseDTOBuilder setRestroom() {
		this.restroom = this.house.getRestroom();
		return this;
	}

	public HouseDTOBuilder setLivingroom() {
		this.livingroom = this.house.getLivingroom();
		return this;
	}

	public HouseDTOBuilder setGarage() {
		this.garage = this.house.getGarage();
		return this;
	}

	public HouseDTOBuilder setBackyard() {
		this.backyard = this.house.getBackyard();
		return this;
	}

	public HouseDTOBuilder setKitchen() {
		this.kitchen = this.house.getKitchen();
		return this;
	}
	
	public HouseDTO build() {
		return new HouseDTO(bedroom, restroom, livingroom, garage, backyard, kitchen);
	}
	
	public class HouseDTO {
		
		private int bedroom;
		private int restroom;
		private int livingroom;
		private int garage;
		private int backyard;
		private int kitchen;

		private HouseDTO(int bedroom, int restroom, int livingroom, int garage, int backyard, int kitchen) {
			super();
			this.bedroom = bedroom;
			this.restroom = restroom;
			this.livingroom = livingroom;
			this.garage = garage;
			this.backyard = backyard;
			this.kitchen = kitchen;
		}

		public int getBedroom() {
			return bedroom;
		}

		public int getRestroom() {
			return restroom;
		}

		public int getLivingroom() {
			return livingroom;
		}

		public int getGarage() {
			return garage;
		}

		public int getBackyard() {
			return backyard;
		}

		public int getKitchen() {
			return kitchen;
		}

		@Override
		public String toString() {
			return "This house DTO has " + bedroom + " bedroom(s), " + restroom + " restroom(s), "
					+ livingroom + " livingroom(s), " + garage + " garage(s), "
					+ backyard + " backyard(s), " + kitchen + " kitchen(s)";
		}
		
	}

}
