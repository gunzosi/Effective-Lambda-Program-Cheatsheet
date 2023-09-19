package ObjectInlinesLambda;

public class InlineLambdas {
    public static void main(String[] args) {
        performanceOperation((a,b) -> a*b,7,4);
    }

    static void performanceOperation(Calculator calc2, int x, int y){
        int resultIL = calc2.add(x, y);
        System.out.println("Result Inline Lambda: " + resultIL);
    }
}
