public class MainClass {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            RunnableThreadDemo printer = new RunnableThreadDemo(i);
            Thread thread = new Thread(printer);
            thread.start();
        }
    }
}
