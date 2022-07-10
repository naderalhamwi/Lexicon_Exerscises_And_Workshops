package exercise01;

public abstract class Vehicle  extends Object{

    private int vehicleId;
    private String registrationNumber;
    private String brand;
    private String productionYear;

    public Vehicle(int vehicleId, String registrationNumber, String brand, String productionyear) {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.productionYear = productionyear;
    }

    public abstract String vehicleInformation();

    public abstract String drive();

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }
}