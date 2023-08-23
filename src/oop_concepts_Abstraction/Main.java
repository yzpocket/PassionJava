package oop_concepts_Abstraction;

public class Main {
    public static void main(String[] args){
        Animal cat = new Cat("Hore",12,12.3,"Korea");
        Animal dog = new Dog("LALA",5,15.6,"States");
        Animal chicken = new Chicken("Coo",2,4.3,"Japan");

        cat.bark();
        dog.bark();
        chicken.bark();
    }
}
