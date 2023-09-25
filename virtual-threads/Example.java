import java.util.concurrent.Executors;

public class Example {

    public static void main(String[] args) {
        try(var executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            executorService.submit(() -> {
                System.out.println("Hello world!");
            });
        }
    }

}
