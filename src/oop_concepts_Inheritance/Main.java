package oop_concepts_Inheritance;

public class Main {
    public static void main(String[] args) {
        //사람 > 의사 와 같은 상속관계가 있다.

        //type 변수명 = new 클래스명( );
        Doctor doc = new Doctor(); //의사클래스 타입의 의사 객체를 만들면,
        doc.heal(); //의사 기술인 치료를 쓸 수 있다
        System.out.println(doc.age); //또한 사람(부모클래스)을 상속 받았기 때문에 나이라는 정보도 볼 수 있다.

        Person doc2 = new Doctor(); //하지만 사람클래스 타입의 의사 객체를 만들면,
        //doc2.heal(); //자식인 의사 클래스의 기술을 쓸 수 없다. doc2라는 참조 변수의 타입이 Person이라는 클래스기 때문에 Person의 능력밖에 못쓴다.
        doc2.eat();//이건 사람의 기본 기술이다.
        doc2.play();//이건 사람의 기본 기술이다.

        //Doctor doc3 = new Person(); //애초에 자식 클래스 변수는 부모 클래스 객체를 참조 할 수 없다.

        Student stu = new Student();
        stu.study();
        Person stu2 = new Person(); //이건 명칭만 stu지 사람타입의 사람객체다.
        Person stu3 = new Student();
        stu3.play();//Person클래스의 메소드다.
    }
}
