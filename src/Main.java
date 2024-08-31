//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Vehicle.java
// This is the base class that represents a generic vehicle.
    public class Vehicle {
        // Attributes of the Vehicle class
        private int numberOfWheels;
        private String color;
        private float engineSize;
        private String fuelType;

        // Constructor to set all attributes when creating a Vehicle object
        public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
            this.numberOfWheels = numberOfWheels;
            this.color = color;
            this.engineSize = engineSize;
            this.fuelType = fuelType;
        }

        // Getter method for numberOfWheels
        public int getNumberOfWheels() {
            return numberOfWheels;
        }

        // Setter method for numberOfWheels
        public void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

        // Getter method for color
        public String getColor() {
            return color;
        }

        // Setter method for color
        public void setColor(String color) {
            this.color = color;
        }

        // Getter method for engineSize
        public float getEngineSize() {
            return engineSize;
        }

        // Setter method for engineSize
        public void setEngineSize(float engineSize) {
            this.engineSize = engineSize;
        }

        // Getter method for fuelType
        public String getFuelType() {
            return fuelType;
        }

        // Setter method for fuelType
        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }
    }

    // Car.java
// This class represents a car, which is a specific type of vehicle.
    public class Car extends Vehicle {
        // Additional attribute for Car
        private String brand;

        // Constructor for Car that also sets the Vehicle attributes
        public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
            // Call the parent (Vehicle) constructor to set its attributes
            super(numberOfWheels, color, engineSize, fuelType);
            this.brand = brand;
        }

        // Getter method for brand
        public String getBrand() {
            return brand;
        }

        // Setter method for brand
        public void setBrand(String brand) {
            this.brand = brand;
        }

        // Method that prints "Honk, honk!" when called
        public void honk() {
            System.out.println("Honk, honk!");
        }

        // Method to display all attributes of the car, including those inherited from Vehicle
        public void displayInfo() {
            System.out.println("Brand: " + getBrand());
            System.out.println("Number of Wheels: " + getNumberOfWheels());
            System.out.println("Color: " + getColor());
            System.out.println("Engine Size: " + getEngineSize() + " liters");
            System.out.println("Fuel Type: " + getFuelType());
        }
    }

    // Main.java
// This class is used to test the Vehicle and Car classes.
    public class main {
        public void Main(String[] args) {
            // Create a Vehicle object
            Vehicle myVehicle = new Vehicle(4, "Red", 2.0f, "Petrol");

            // Create a Car object
            Car myCar = new Car(4, "Blue", 1.8f, "Diesel", "Toyota");

            // Test the honk method of Car
            myCar.honk();

            // Display information of the Car
            myCar.displayInfo();

            // Display information of the Vehicle using getters
            System.out.println("Vehicle Color: " + myVehicle.getColor());
        }
    }

}
