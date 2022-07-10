package exercise01;

public class Motorcycle extends Vehicle{

    private int numberOfWheels;
    private int numberOfPassenger;

    public Motorcycle(int vehicleId, String registrationNumber, String brand, String productionyear, int numberOfWheels, int numberOfPassenger) {
        super(vehicleId, registrationNumber, brand, productionyear);
        this.numberOfWheels = numberOfWheels;
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public String drive() {
        return "Motorcycle Driving";
    }

    public String vehicleInformation() {
        return  "Id: " + getVehicleId() +
                "\n Registration number: " + getRegistrationNumber() +
                "\n Brand: " + getBrand() + " " +
                "\n Production year" + getProductionYear() +
                "\n Number of wheels" + numberOfWheels +
                "\n Number of passenger" + numberOfPassenger;
    }
}
