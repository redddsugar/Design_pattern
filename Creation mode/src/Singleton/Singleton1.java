package Singleton;

public class Singleton1 {

    private Singleton1() {
    }

    public static final Singleton1 instance = new Singleton1();

    private String name = "我是单例1";

    public String getName(){
        return this.name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public static Singleton1 getInstance(){
        return instance;
    }
}
