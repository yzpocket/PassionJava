package oop_concepts_Polymorphism;

public class Superman extends Human{
    String name;
    int power; //superman 만의 특수 능력
    int speed; //superman만의 특수 능력 (부모로 상속받지 않은것임)
    public Superman(int age, int weight, int height, String name, int power, int speed){
        super(age, weight, height); // 객체 생성 시 age, weight는 부모클래스의 정보를 그대로 활용<< 정적 바인딩 Static binding 된 상태
        this.name = name;
        this.power = power; //객체 (인스턴스)생성 시 인자로 전달하여 매개변수로 들어온 power, speed를 this를 통해 객체(인스턴스)의 power에  할당
        this.speed = speed;
    }
    public void move(){
        System.out.println("재빠르게"); // <<<<<------ 부모에게도 있는 move()지만 자식에서 오버로딩해서 객체는 Superman 타입이라 이것이 실행됨.(덮어짐)
        System.out.println("움직이고");
        System.out.println("피하기!!");
    }
    public void fly(){
        System.out.println("날라요");
    }
    public void attack(){
        System.out.println("때려요");
    }
}
