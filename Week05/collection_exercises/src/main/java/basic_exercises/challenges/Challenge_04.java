package basic_exercises.challenges;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Challenge_04 {
    public void printList(){
        Integer[] numbers = new Integer[]{1,4,4,2,6,7};

        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, numbers);

        System.out.println(set);
    }
}
