package oop_concepts_Abstraction;

public abstract class Animal {
    String name;
    int age;
    double speed;
    String country;

    public Animal(String name, int age, double speed, String country) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.country = country;
    }

    public void move() {//공통적인 움직임
        System.out.println("이동한다");
    }
    public void eat() {//공통적인 먹는 행위
        System.out.println("먹는다");
    }
    public void play() {//공통적인 노는 행위
        System.out.println("장난친다");
    }
    public abstract void bark(); //짖는 소리는 동물마다 다르므로 추상메서드로 생성
    //    추상 메소드를 하나라도 가지는 클래스는 반드시 추상 클래스가 되어야 함
}