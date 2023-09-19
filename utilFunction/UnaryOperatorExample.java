import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // Định nghĩa một UnaryOperator để nhân một số nguyên cho 2
        UnaryOperator<Integer> multiplyByTwo = x -> x * 2;

        // Áp dụng phép toán lên một số
        int result = multiplyByTwo.apply(5);

        System.out.println("Result: " + result); // Output: Result: 10
    }
}
