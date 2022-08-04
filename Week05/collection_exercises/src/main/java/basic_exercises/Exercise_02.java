package basic_exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise_02 {
    public void printList(){
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");

        for (String days:myList) {
            System.out.println(days);
        }


    }
}
