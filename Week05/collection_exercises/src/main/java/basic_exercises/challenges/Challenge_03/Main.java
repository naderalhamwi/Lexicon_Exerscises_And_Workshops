package basic_exercises.challenges.Challenge_03;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<SuperHero> s = new ArrayList<SuperHero>();
        s.add(new SuperHero(0,12,"name1"){});
        s.add(new SuperHero(1,4,"name2"){});
        s.add(new SuperHero(2,70,"name3"){});
        s.add(new SuperHero(3,10,"name4"){});

        s.sort(Comparator.comparing(SuperHero::getAge));

        for (SuperHero str : s)
        {
            System.out.println(
                    "Id: " + str.getId() +
                    ", Age: " + str.getAge() +
                            ", Name: " + str.getName() + ".");
        }

    }
}