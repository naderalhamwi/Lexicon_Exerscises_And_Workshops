package basic_exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise_04 {
    public void printList(){
        List<String> myList = new ArrayList<>();
        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");

        List<String> myNewList = myList.subList(0, 3);
        System.out.println(myNewList);
    }
}