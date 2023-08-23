package oop_concepts_Encapsulation;

public class Member {
    public int memberNum; //public 접근 제어자로 모든 객체에서 접근 가능. (해당 프로젝트 내)
    private String id; //private 접근 제어자로 해당 클래스(member) 에서만 사용 가능.
    private String pw;
    private int age;
    String memo = "Memo"; //default 접근 제어자 동일한 패키지 안에서만 접근이 가능하다.

    //getter
    public String getId() {
        return id;
    }
    public String getPw() {
        return pw;
    }
    public int getAge() {
        return age;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
