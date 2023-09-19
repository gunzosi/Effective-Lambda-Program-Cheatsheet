import java.util.function.BiFunction;

public class BiExFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addThreeNumbers = (a, b) -> a + b + 10;
        int result1 = addThreeNumbers.apply(5, 3);
        System.out.println("Result 1: " + result1); // Output: 18

        BiFunction<Integer, Integer, BiFunction<Integer, Integer, Integer>> addFourNumbers =
                (a, b) -> (c, d) -> a + b + c + d;

        int result2 = addFourNumbers.apply(2, 3).apply(4, 5);
        System.out.println("Result 2: " + result2); // Output: 14

        BiFunction<Integer, Integer, BiFunction<Integer, Integer, BiFunction<Integer, Integer, Integer>>> addFiveNumbers =
                (a, b) -> (c, d) -> (e, f) -> a + b + c + d + e + f;

        int result3 = addFiveNumbers.apply(1, 2).apply(3, 4).apply(5, 6);
        System.out.println("Result 3: " + result3); // Output: 21
    }
}
