package edu.marcus.designpatterns.creational.builder;

public class HouseBuilder {
	
	private int bedroom;
	private int restroom;
	private int livingroom;
	private int garage;
	private int backyard;
	private int kitchen;
	
	public HouseBuilder setBedroom(int i) {
		this.bedroom = i;
		return this;
	}
	
	public HouseBuilder setRestroom(int i) {
		this.restroom = i;
		return this;
	}

	public HouseBuilder setLivingroom(int i) {
		this.livingroom = i;
		return this;
	}

	public HouseBuilder setGarage(int i) {
		this.garage = i;
		return this;
	}

	public HouseBuilder setBackyard(int i) {
		this.backyard = i;
		return this;
	}

	public HouseBuilder setKitchen(int i) {
		this.kitchen = i;
		return this;
	}
	
	public House build() {
		return new House(bedroom, restroom, livingroom, garage, backyard, kitchen);
	}
	
	public class House {
		
		private int bedroom;
		private int restroom;
		private int livingroom;
		private int garage;
		private int backyard;
		private int kitchen;

		private House(int bedroom, int restroom, int livingroom, int garage, int backyard, int kitchen) {
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
			return "This house has " + bedroom + " bedroom(s), " + restroom + " restroom(s), "
					+ livingroom + " livingroom(s), " + garage + " garage(s), "
					+ backyard + " backyard(s), " + kitchen + " kitchen(s)";
		}
		
	}

}
