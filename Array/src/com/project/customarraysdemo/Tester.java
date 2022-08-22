package com.project.customarraysdemo;

public class Tester {
	public static void main(String[] args) {
		Bike bike=new Bike("Pulsar", "Black", 125000.00, 150, 50, 5, true);
		Bike bike1=new Bike("Royal Enfield", "Black", 250000.00, 350, 35, 6, true);
		Bike bike2=new Bike("Bmw", "Gray", 350000.00, 310, 30, 6, true);
		Bike bike3=new Bike("Mt", "Black", 260000.00, 155, 45, 5, true);
		Bike bike4=new Bike("Tvs", "Blue", 100000.00, 115, 90, 0, true);
		Bike bike5=new Bike("Kawasaki", "Blue", 120000.00, 110, 75, 4, true);
	
		Bike[] bikes1= {bike,bike1,bike2,bike3,bike4,bike5};
		
		for(Bike b:bikes1) {
			System.out.println(b);
		}	
		Bike[] bikes=new Bike[6];//creation of array of type bike
		//initialization of objects inside the container
		bikes[0]=bike;
		bikes[1]=bike1;
		bikes[2]=bike2;
		bikes[3]=bike3;
		bikes[4]=bike4;
		bikes[5]=bike5;
		
//		for(Bike dupl1:bikes) {
//			if(dupl1==bike3) {
//				System.out.println(dupl1);
//			}
//		}
		
		
//		for(Bike dupl:bikes) {
//			System.out.println(dupl);
//		}
//		System.out.println(bikes[3]);
//		
	}

}
