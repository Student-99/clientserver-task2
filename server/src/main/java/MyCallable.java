import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    String row;
    public MyCallable(String row) {
        this.row = row;
    }

    @Override
    public String call() {
       return row.replaceAll("\\s","");
    }
}
