package oop_concepts_Abstraction;

import oop_concepts_Encapsulation.Member;

public class Main {
    public static void main(String[] args){
        Animal cat = new Cat("Hore",12,12.3,"Korea");
        Animal dog = new Dog("LALA",5,15.6,"States");
        Animal chicken = new Chicken("Coo",2,4.3,"Japan");

        cat.bark();
        dog.bark();
        chicken.bark();

        //-------------- Encapsulation example test
        Member member = new Member();
        System.out.println(member.memberNum); //memberNum은 public이라 다른 패키지에서도 이용 할 수 있음.
        //System.out.println(member.memo);
        //System.out.println(member.id); // private, default 역시 다른 패키지에서 사용 불가능
        System.out.println(member.getId()); //private id지만, getId() getter는 public이라 사용 가능!
    }
}
