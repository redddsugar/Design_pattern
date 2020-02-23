package adapter;

import java.util.concurrent.Callable;

public class Plug_3Adapter implements Runnable{

    // 引用待转换接口:
    private Callable<?> plug_2;

    public Plug_3Adapter(Callable<?> plug_2) {
        this.plug_2 = plug_2;
    }


    // 实现目标指定接口:
    @Override
    public void run() {
        try {
            plug_2.call();
            System.out.println("Adapter:将plug_2转为一个plug_3");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
