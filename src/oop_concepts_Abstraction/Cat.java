package oop_concepts_Abstraction;

public class Cat extends Animal{
    public Cat(String name, int age, double speed, String country){
        super(name, age, speed, country);
    }
    @Override
    public void bark(){
        System.out.println("야옹");
    }
}
