package basic_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Exercise_06 {
    public void printList(){
        String[] days = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};

        LinkedHashSet<String> set = new LinkedHashSet<>();
        Collections.addAll(set, days);

        ArrayList<String> myList = new ArrayList<>(set);

        System.out.println(myList);
    }
}