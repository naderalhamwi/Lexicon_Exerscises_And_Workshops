package basic_exercises.challenges.Challenge_03;

public class SuperHero implements Comparable<SuperHero>{
    private int id;
    private int age;
    private String name;

    @Override
    public int compare(SuperHero superHero){
        if(age == superHero.age){
            return 0;
        } else if (age > superHero.age) {
            return 1;
        }else {
            return -1;
        }
    }

    public SuperHero(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
