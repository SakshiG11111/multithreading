public class RunnableThreadDemo implements Runnable {
    private int number;

    public RunnableThreadDemo(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number);
    }
}

