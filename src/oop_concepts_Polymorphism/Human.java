package oop_concepts_Polymorphism;

public class Human {
    int age=22;
    int weight=22;
    int height=22;

    public Human(int age, int weight, int height){

    }
    public void move(){
        System.out.println("움직여요");
    }
    public void stop(){
        System.out.println("멈춰요");
    }
}
