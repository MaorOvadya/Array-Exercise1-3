
// Make a record to store information about a car. It should contain fields for: - make -or- brand (String) - model (String) - year (int)
// Create an ArrayList of Car objects.
// Sort the ArrayList of cars by year (Ascending) and print them out.

import java.util.ArrayList;

public class Q3 {

public static void main(String[] args) {
    
        ArrayList <Cars> carObject = new ArrayList<>();
        carObject.add(new Cars("Toyota", "GR Corolla", 2022));
        carObject.add(new Cars("Toyota", "Prius", 2020));
        carObject.add(new Cars("Toyota", "Corolla", 2018));
        carObject.add(new Cars("Toyota", "Corolla Cross", 2021));
        carObject.add(new Cars("Toyota", "C-HR", 2016));

        carObject.sort(null);
        System.out.println(carObject);
    }
       
}

class Cars implements Comparable <Cars> { 

    private String brand;
    private String model;
    private int year;

    public Cars(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    @Override
    public String toString() {
        return "\nCars Details: brand = " + brand + ", model = " + model + ", year = " + year + "\n";
    }

    @Override
    public int compareTo(Cars o) {
        return this.year - o.year;
    }
}