public class noLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Welcome to JAVA!");
            }
        });

        thread.start();
    }
    
}
