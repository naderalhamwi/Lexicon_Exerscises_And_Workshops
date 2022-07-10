package exercise01;

public class Main {
    public static void main(String[] args){

        Car newCar = new Car(
                1,
                "RTY 793",
                "BMW",
                "1998-04-14",
                "Sedan",
                5,
                2.4
        );

        Motorcycle newMotorcycle = new Motorcycle(
                3,
                "RGT 214",
                "BMW",
                "2010-06-19",
                2,
                1

        );

        Truck newTruck = new Truck(
                2,
                "TYU 955",
                "Ccania",
                "2012-03-04",
                1.4,
                514,
                "Farm Truck"
        );


        /**
         * Two method available for each instance
         * - vehicleInformation
         * - drive
         * */


        //System.out.println(newCar.vehicleInformation());
        //System.out.println(newMotorcycle.vehicleInformation());
        //System.out.println(newTruck.vehicleInformation());

        //System.out.println(newCar.drive());
        //System.out.println(newMotorcycle.drive());
        //System.out.println(newTruck.drive());


    }
}
