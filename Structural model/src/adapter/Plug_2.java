package adapter;

import java.util.concurrent.Callable;

public class Plug_2 implements Callable<String> {
    private String msg;

    public Plug_2(String msg) {
        this.msg = msg;
    }

    @Override
    public String call() throws Exception {
        System.out.println(msg);
        return msg;
    }
}
