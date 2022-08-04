package basic_exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Exercise_08 {
    public void printList(){
        String[] Names = new String[]{
                "Hans Pettersson",
                "Peter Jonsson",
                "Carl Olsson",
                "Roger Lundström",
                "Johan Eriksson",
                "Alexander Magnusson",
                "Ulf Berglund"};

        LinkedHashSet<String> set = new LinkedHashSet<>();
        Collections.addAll(set, Names);

        ArrayList<String> myList = new ArrayList<>(set);
        Collections.sort(myList);

        System.out.println("Unsorted name list: " + set);
        System.out.println("Sorted name List: " + myList);
    }
}
