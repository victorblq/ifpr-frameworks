package br.com.ifpr.victor;

public class Main {

	public static void main(String[] args) {
		CarDescription carDescription = CarDescription.getInstance();
		CarDescription carDescription2 = CarDescription.getInstance();
		
		System.out.println("Car description 2: "+carDescription.getCarDescription("palio"));
		System.out.println("Car description 1: "+carDescription2.getCarDescription("corsa"));
		System.out.println("Car description 2: "+carDescription.getCarDescription("celta"));
		System.out.println("Car description 1: "+carDescription2.getCarDescription("gol"));
	}

}
