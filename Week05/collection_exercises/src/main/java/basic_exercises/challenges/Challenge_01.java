package basic_exercises.challenges;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Challenge_01 {
     public void printList(){
         String[] days = new String[]{
                 "Monday",
                 "Tuesday",
                 "Wednesday",
                 "Thursday",
                 "Friday",
                 "Saturday",
                 "Sunday"};

         Set<String> weekendSet = new HashSet<>();
         weekendSet.add(days[5]);
         weekendSet.add(days[6]);

         Set<String> daysSet = new HashSet<>();
         Collections.addAll(daysSet, days);

         System.out.println("Weekend Days: " + weekendSet);
         System.out.println("Week Days: " + daysSet);

         //Retain all days that equal in both set
         daysSet.retainAll(weekendSet);

         System.out.println("Week days set after Retain: " + daysSet);

     }
}