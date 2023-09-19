import java.util.function.*;

public class intPre {
    public static void main(String[] args) {
        // IntPredicate
        IntPredicate isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(7)); // Output: false

        // LongPredicate
        LongPredicate isPositive = (num) -> num > 0;
        System.out.println(isPositive.test(10L)); // Output: true
        System.out.println(isPositive.test(-5L)); // Output: false

        // DoublePredicate
        DoublePredicate isGreaterThanZero = (num) -> num > 0.0;
        System.out.println(isGreaterThanZero.test(3.5)); // Output: true
        System.out.println(isGreaterThanZero.test(-2.0)); // Output: false
    }
}
