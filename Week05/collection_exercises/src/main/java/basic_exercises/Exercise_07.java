package basic_exercises;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Exercise_07 {
    public void printList(){
        String[] Names = new String[]{
                "Alexander Magnusson",
                "Carl Olsson",
                "Hans Pettersson",
                "Peter Jonsson",
                "Johan Eriksson",
                "Roger Lundström",
                "Ulf Berglund"};

        LinkedHashSet<String> set = new LinkedHashSet<>();
        Collections.addAll(set, Names);

        System.out.println(set);
    }
}
