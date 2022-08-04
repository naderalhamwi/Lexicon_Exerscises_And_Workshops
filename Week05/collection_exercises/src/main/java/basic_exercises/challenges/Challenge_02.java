package basic_exercises.challenges;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Challenge_02 {
    public void printList(){
        HashMap<String,String> user = new HashMap<>();
        user.put("AlexanderMagnusson@gmail.com","Alexander Magnusson");
        user.put("CarlOlsson@gmail.com","Carl Olsson");
        user.put("HansPettersson@gmail.com","Hans Pettersson");

        Set<String> set = new HashSet<>();
        set.addAll(user.keySet());

        System.out.println(set);

    }
}
