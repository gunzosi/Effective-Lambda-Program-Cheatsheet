package GenericLambda;

public class VariableSyntax {
    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = (var a, var b) -> a + b;
        int intResult = integerCalculator.add(10, 20);

        Calculator<Double> doubleCalculator = (var a, var b) -> a + b;
        double doubleResult = doubleCalculator.add(10.5, 20.7);

        System.out.println("Integer Result: " + intResult);
        System.out.println("Double Result: " + doubleResult);
    }
}
