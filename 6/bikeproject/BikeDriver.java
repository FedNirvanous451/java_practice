package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();
		RoadBike bike_ = new RoadBike(20);
		
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();

		// моя реализация
		System.out.println("------");
		System.out.println(bike_.getPostHeight());
		System.out.println(bike2.getTyreWidth());
	}//end method main

}//end class BikeDriver
