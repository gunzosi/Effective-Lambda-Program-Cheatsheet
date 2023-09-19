package ObjectInlinesLambda;

public class VariableSyntax {
    public static void main(String[] args) {
        Calculator vs = (var x, var y) -> x + y;
         int result = vs.add(10, 20);
        //double result = vs.add(10.5, 20.6);
        System.out.println("Result: " + result);
    }
}
