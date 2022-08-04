package basic_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Exercise_09 {
    public void printList(){
        String[] brand = new String[]{
                " Audi",
                " BMW",
                " GMC",
                " Honda",
                " Lamborghini",
                " Volkswagen",
                " Subaru"};

        HashMap<Integer,String> cars = new HashMap<>();

        for (int i = 0; i < brand.length; i++) {
            cars.put(i, brand[i]);
        }

        System.out.println(cars);
    }
}