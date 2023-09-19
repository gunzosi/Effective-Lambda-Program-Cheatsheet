package ObjectInlinesLambda;

public class NoneLambda {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImp1();
            int resultNone = calculator.add(5,3);
            System.out.println("Result None Lambda: " + resultNone);   
    }

    static class CalculatorImp1 implements Calculator {
        @Override
        public int add(int a, int b){
            return a + b;
        }
    }
}
