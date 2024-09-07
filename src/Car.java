//Car class that extends Vehicle
class Car extends Vehicle {
    // Additional attribute for Car
    private String brand;

    // Constructor that includes attributes from Vehicle and Car
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);  // Call the constructor of the Vehicle class
        this.brand = brand;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Method to honk
    public void honk() {
        System.out.println("Honk, honk!");
    }

    // Method to display information about the car
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
    }
}
// Main class made to test Vehicle and Car classes
class Main {
    public static void main(String[] args) {
        // Creating a Vehicle object
        Vehicle myVehicle = new Vehicle(4, "Blue", 2.5f, "Gasoline");

        // Creating a Car object
        Car myCar = new Car(4, "Blue", 2.0f, "Diesel", "Toyota");

        // Testing the honk method for Car
        myCar.honk();

        // Testing displayInfo method for Car
        myCar.displayInfo();
    }}