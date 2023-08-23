package oop_concepts_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Superman sup = new Superman(25,56,123,"john",321,212);
        System.out.println("age:"+sup.age);//부모로부터 상속받은것
        System.out.println("weight:"+sup.weight);//부모로부터 상속받은것
        System.out.println("height:"+sup.height);//부모로부터 상속받은것
        System.out.println("name:"+sup.name);//오버로딩한 매개변수
        System.out.println("power:"+sup.power);//오버로딩한 매개변수
        System.out.println("speed:"+sup.speed);//오버로딩한 매개변수
        sup.attack();//본인
        sup.move();// --> Override 부모의 내부 소스 재정의 <<------ Superman이 덮음, Dynamic Binding
    }
}
