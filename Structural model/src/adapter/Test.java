package adapter;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Callable<String> plug_2 = new Plug_2("Plug2:我是plug2");
        Thread socket_3 = new Socket_3(new Plug_3Adapter(plug_2));
        socket_3.start();
    }
}
