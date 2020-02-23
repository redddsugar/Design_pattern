package Singleton;

public class CreateSingleton {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1.getName());

        Singleton2 singleton2 = Singleton2.Instance;
        System.out.println(singleton2.getName());
    }
}
