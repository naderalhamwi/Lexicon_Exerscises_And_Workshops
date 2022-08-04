package basic_exercises.Exercise_12;

import java.util.HashMap;

public class Main {
    public void printCars(){
        Car volvo = new Car(0, " Volvo "," V70 ");
        Car bmw = new Car(0, " BMW "," E60 ");
        Car subaru = new Car(0, " Subaru "," WRX STI ");

        HashMap<Integer, Car> myCarsList = new HashMap<>();

        myCarsList.put(0, volvo);
        myCarsList.put(1, bmw);
        myCarsList.put(2, subaru);

        System.out.println(myCarsList);
    }
}