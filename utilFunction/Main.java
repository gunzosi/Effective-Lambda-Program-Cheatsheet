import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Example 1: Predicate
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println("Is 5 even? " + isEven.test(5)); //! Output: false
        System.out.println("Is 10 even? " + isEven.test(10)); //! Output: true

        // Example 2: Consumer
        Consumer<String> printUpperCase = (str) -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello"); //! Output: HELLO

        // Example 3: Function
        Function<Integer, String> intToString = (num) -> "Number: " + num;
        String result = intToString.apply(42);
        System.out.println(result); //! Output: Number: 42

        // Example 4: Supplier
        Supplier<Double> getRandomNumber = () -> Math.random();
        double randomNum = getRandomNumber.get();
        System.out.println("Random number: " + randomNum); //! Output: Random number: [a random number]
    }
}
