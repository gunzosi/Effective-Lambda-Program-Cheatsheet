import java.util.function.BiPredicate;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class biPre2 {
    public static void main(String[] args) {
        // BiPredicate example
        BiPredicate<Integer, String> isLengthEqual = (num, str) -> str.length() == num;
        System.out.println(isLengthEqual.test(5, "Hello")); // Output: true
        System.out.println(isLengthEqual.test(5, "World")); // Output: false

        // BiConsumer example
        BiConsumer<String, Integer> printKeyValue = (key, value) -> System.out.println(key + " : " + value);
        printKeyValue.accept("Age", 30); // Output: Age : 30

        // BiFunction example
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3)); // Output: 8
    }
}
