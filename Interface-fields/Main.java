package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1...10
        Car audi = new Car("Audi");
        Car fiat = new Car("Fiat");
        Car mazda = new Car("Mazda");
        Car renault = new Car("Renault");
        Car toyota = new Car("Toyota");
        Car lotus = new Car("Lotus");
        Car benz = new Car("Benz");
        Car jaguar = new Car("Jaguar");
        Car kia = new Car("Kia");
        Car lexus = new Car("Lexus");
        System.out.println(Vehicle.manufacturedVehicles.toString());

        // 11...
        Car volvo = new Car("Volvo");
        Car ford = new Car("Ford");
        Car bmw = new Car("BMW");

        System.out.println(Vehicle.manufacturedVehicles.toString());
    }
}
