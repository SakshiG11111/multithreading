import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> 20 + 22;

        try {
            Future<Integer> result = executor.submit(task);
            System.out.println(result.get());
        } finally {
            executor.shutdown();
        }
    }
}
