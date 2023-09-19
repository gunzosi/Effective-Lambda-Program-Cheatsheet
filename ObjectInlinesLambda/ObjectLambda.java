package ObjectInlinesLambda;

public class ObjectLambda {
    public static void main(String[] args) {
        Calculator calc = (a,b) -> a+b;
        int resultOL = calc.add(6, 4);
        System.out.println("Result ObjectLambda: " + resultOL);
    }
}
