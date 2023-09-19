public class LambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Welcome to JAVA PROGRAM!");
        });
        thread.start();
    }
}