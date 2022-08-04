package basic_exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise_03 {
    public void printList(){
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        //myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");

        System.out.println("My list without Thursday");
        for (String days:myList) {
            System.out.println(days);
        }

        System.out.println(" ");

        System.out.println("My list with Thursday Added");
        myList.add(3, "Thursday");
        for (String days:myList) {
            System.out.println(days);
        }
    }
}