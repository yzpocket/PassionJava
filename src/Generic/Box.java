package Generic;

public class Box<T>{
    protected T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }

    class SteelBox<T> extends Box<T>{
        public SteelBox(T o){
            ob = o;
        }
    }

    //메소드를 호출 할 때, Type을 지정해줘야 위 Box<T>클래스에서 T부분에 대입되고, SteelBox<T>또한 상속 받게 된다.
    Box<Integer> iBox = new SteelBox<>(7959); //new SteelBox<Integer>(7959); 로 Integer라는 타입이 생략된 것이다. (컴파일러가 알아서 해줌)
    //SteelBox는 Box를 상속 받고 있는데, 같은 Type(Integer)인 경우 상속관계가 유지된다.



}
