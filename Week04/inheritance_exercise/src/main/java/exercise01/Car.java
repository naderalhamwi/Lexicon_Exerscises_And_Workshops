package exercise01;

public class Car extends Vehicle{

    private String carType;
    private int numberOfDoors;
    private double enginVolume;

    public Car(int vehicleId, String registrationNumber, String brand, String productionyear, String carType, int numberOfDoors, double enginVolume) {
        super(vehicleId, registrationNumber, brand, productionyear);
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.enginVolume = enginVolume;
    }

    @Override
    public String drive(){
        return "Car driving";
    }

    @Override
    public String vehicleInformation() {
        return  " Id: " + getVehicleId() +
                "\n Registration number: " + getRegistrationNumber() +
                "\n Brand: " + getBrand() + " " +
                "\n Production year" + getProductionYear() +
                "\n Car type" + carType +
                "\n Number of doors" + numberOfDoors +
                "\n Engin volume" + enginVolume;
    }
}
