package oop_concepts_Abstraction;

public class Chicken extends Animal{
    public Chicken(String name, int age, double speed, String country){
        super(name, age, speed, country);
    }

    @Override
    public void bark(){
        System.out.println("꼬끼오");
    }
}
