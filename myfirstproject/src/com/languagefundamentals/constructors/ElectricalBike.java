package com.languagefundamentals.constructors;

class Vechile {

    String model;

    Vechile(String model) {
        this.model = model;
        System.out.println("constructor called from vehicle");
    }
}

class Bike extends Vechile {

    String brand;
    double price;

    Bike(String model, String brand, double price) {
        super(model);
        this.brand = brand;
        this.price = price;
    }
}

public class ElectricalBike extends Bike {

    int batteryCapacity;

    ElectricalBike(String model, String brand,
                   double price, int batteryCapacity) {

        super(model, brand, price);
        this.batteryCapacity = batteryCapacity;
    }

    void bikeinfo() {
        System.out.println("Bike model: " + model);
        System.out.println("Bike brand: " + brand);
        System.out.println("Bike price: " + price);
        System.out.println("Battery Capacity: "
                           + batteryCapacity);
    }

    public static void main(String[] args) {

        System.out.println("main method started");

        ElectricalBike e1 = new ElectricalBike(
            "Electric", "Ultraviolette", 45000, 75
        );

        e1.bikeinfo();
    }
}