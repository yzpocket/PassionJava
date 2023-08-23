package oop_concepts_Abstraction;

public class Dog extends Animal{
    public Dog(String name, int age, double speed, String country){
        super(name, age, speed, country);
    }
    @Override
    public void bark() {//super 부모 클래스에서 추상 메소드로 생성했기 때문에 자식 클래스에서 실제 구현해야 함.
        System.out.println("멍멍");
    }
}
