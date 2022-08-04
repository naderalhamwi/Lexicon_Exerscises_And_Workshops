package basic_exercises;

import java.util.*;

public class Exercise_05 {
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

        System.out.println(set);
    }
}