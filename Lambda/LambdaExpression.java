package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression implements myFunctionInterF {
    public static void main(String[] args) {

        //** 1.  Lambda không có tham số

        MyFunctionalInterface1 func1 = () -> 
            System.out.println("Hello World");
            System.out.print("Không có tham số (1): ");
         func1.myMethod1();
    

        //! 2. Lambda có 1 tham số
        MyFunctionalInterface2 func2 = (x) -> {return x * 2;};
        int result2 = func2.myMethod2(5);
        System.out.println("Có 1 tham số (2): " + result2);


        //? 3. Lambda có nhiều tham số
        MyFunctionalInterface3 func3 = (x,y) -> {
            return x+y;
        };

        int result3 = func3.myMethod3(5, 6);
        System.out.println("Có nhiều tham số (3): " + result3);

        //? 4. Lambda không có cặp ngoặc hoặc kiểu dữ liệu tự suy luận 
        MyFunctionalInterface4 func4 = x -> x*x;
        int result4 = func4.myMethod4(3);
        System.out.println("Không có cặp ngoặc và kiểu dữ liệu tự suy luận (4): " + result4 ); 

        //? 5. Lambda trong 1 biểu thức
        MyFunctionalInterface5 func5 = (x) -> x * x;
        int result5 = func5.myMethod5(3);
        System.out.println("Lambda trong 1 biểu thức (5): " + result5);

        //? 6. Lamda với phương thức chuẩn 
        MyFunctionalInterface6 func6 = x -> System.out.println(x);
        func6.myMethod6("Lambda với phương thức chuẩn! -> (6)");

        //? 7. Lambda với phương thức tĩnh 
        MyFunctionalInterface7 func7 = x -> Math.abs(x);
        int result7 = func7.myMethod7(-5);
        System.out.println("Lambda với phương thức tĩnh (7): " + result7);

        //? 8. Lambda với điều kiệu (Filtering - BOOLEAN)
        MyFunctionalInterface8 func8 = x -> x > 5;
        boolean result8 = func8.myMethod8(6);
        System.out.println("Lambda với điều kiệu (Filtering - BOOLEAN) (8): " + result8);

        //? 9. Lambda với các phương thức non-static
        String str = "Hello Lambda";
        MyFunctionalInterface9 func9 = s -> s.length();
        int result9 = func9.myMethod9(str);
        System.out.println("Lambda với các phương thức non-static (9): " + result9);

        //? 10. Lambda với các constructor 
        MyFunctionalInterface10 func10 = x -> new ArrayList<>(Arrays.asList(x));
        List<Integer> result10 = func10.myMethod10(new Integer[]{1,3,5,7,9,11,13,15,17});
        System.out.println("Lambda với các constructor (10): " + result10);
    }
}
