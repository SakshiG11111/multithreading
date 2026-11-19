import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> task = () -> "Callable task completed";
        FutureTask<String> result = new FutureTask<>(task);

        new Thread(result).start();
        System.out.println(result.get());
    }
}
