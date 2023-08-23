package oop_concepts_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        System.out.println(member.memberNum); //Member Class의 public 접근 제어자로 선언된 필드 memberNum은 인스턴스로 바로 접근 가능.
        //System.out.println(member.id); //private 접근 제어자로 선언된 id 등은 인스턴스에서 못꺼냄
        //System.out.println(member.age); //private 접근 제어자로 선언된 id 등은 인스턴스에서 못꺼냄
        System.out.println(member.getId()); //private인 필드는 클래스에서 getter, setter를 통해 접근 할 수 있음.
        System.out.println(member.getAge()); //private인 필드는 클래스에서 getter, setter를 통해 접근 할 수 있음.
    }
}
