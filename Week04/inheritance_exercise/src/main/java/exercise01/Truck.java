package exercise01;

public class Truck  extends Vehicle{

    private double maxWeight;
    private int truckHorsepower;
    private String truckEnvironment;

    public Truck(int vehicleId, String registrationNumber, String brand, String productionyear, double maxWeight, int truckHorsepower, String truckEnvironment) {
        super(vehicleId, registrationNumber, brand, productionyear);
        this.maxWeight = maxWeight;
        this.truckHorsepower = truckHorsepower;
        this.truckEnvironment = truckEnvironment;
    }

    @Override
    public String drive() {
        return "Truck Driving";
    }

    @Override
    public String vehicleInformation() {
        return  "Id: " + getVehicleId() +
                "\n Registration number: " + getRegistrationNumber() +
                "\n Brand: " + getBrand() + " " +
                "\n Production year" + getProductionYear() +
                "\n Max weight" + maxWeight + "T" +
                "\n Truck horsepower" + truckHorsepower + "Hp" +
                "\n Truck environment" + truckEnvironment;
    }
}