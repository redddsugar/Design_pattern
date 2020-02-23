package Singleton;

public enum Singleton2 {

    Instance;

    private String name = "我是单例2";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
