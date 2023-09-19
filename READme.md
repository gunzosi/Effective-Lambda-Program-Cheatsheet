# Effective-Lambda-Program-Cheatsheet

# 1. LAMBDA là gì?

**Lambda** là một tính năng trong ngôn ngữ lập trình Java cho phép định nghĩa và sử dụng các hàm ẩn danh một cách tiện lợi. **Lambda** giúp viết mã ngắn gọn hơn và tập trung vào logic xử lý chính mà không cần phải tạo ra các phần code phức tạp.

1. Ví dụ khi [KHÔNG SỬ DỤNG LAMBDA](noLambdaExample.java)

```java
public class noLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Welcome to JAVA!");
            }
        });

        thread.start();
    }
}
```

```java
> Output: Welcome to JAVA!
```

2. Ví dụ khi [SỬ DỤNG LAMBDA](LambdaExample.java)

```java
public class LambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Welcome to JAVA PROGRAM!");
        });
        thread.start();
    }
}
```

```java
> Output: Welcome to JAVA PROGRAM!
```

# 2. Một số cú pháp cho LAMBDA

1. Lambda không có tham số:

```java
() -> { // code };
```

2. Lambda có một tham số

```java
(parameter) -> { // code };
```

3. Lambda với nhiều tham số

```java
(parameter1, parameter2) -> { // code };
```

4. Lambda không có cặp ngoặc và kiểu dữ liệu tự suy luận

```java
parameter -> { }; // code ;
```

5. Lambda trong một biểu thức

```java
(parameter) -> expression;
```

6. Lambda với các phương thức chuẩn

```java
(parameter) -> method(parameter);
```

7. Lambda với các phương thức tĩnh

```java
(parameter) -> Class.method(parameter);
```

8. Lambda với điều kiện (filtering)

```java
(parameter) -> expression that returns boolean;
```

9. Lambda với các phương thức non-static

```java
(parameter) -> object.method(parameter);
```

10. Lambda với các constructor

```java
(parameter) -> new ClassName(parameter);
```

### Example: `package` [Lambda](Lambda) với `Class` [LambdaExpression](Lambda/LambdaExpression.java) cùng với `Interface` [myFunctionInterF](Lambda/myFunctionInterF.java)

```java
package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression implements myFunctionInterF {
    public static void main(String[] args) {

        //** 1.  Lambda không có tham số

        MyFunctionalInterface1 func1 = () ->
            System.out.println("Hello World");
            System.out.print("Không có tham số: ");
         func1.myMethod1();


        //! 2. Lambda có 1 tham số
        MyFunctionalInterface2 func2 = (x) -> {return x * 2;};
        int result2 = func2.myMethod2(5);
        System.out.println("Có 1 tham số (1): " + result2);


        //? 3. Lambda có nhiều tham số
        MyFunctionalInterface3 func3 = (x,y) -> {
            return x+y;
        };

        int result3 = func3.myMethod3(5, 6);
        System.out.println("Có nhiều tham số (2): " + result3);

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
```

```java
// Output:
Không có tham số (1): Hello World
Có 1 tham số (2): 10
Có nhiều tham số (3): 11
Không có cặp ngoặc và kiểu dữ liệu tự suy luận (4): 9
Lambda trong 1 biểu thức (5): 9
Lambda với phương thức chuẩn! -> (6)
Lambda với phương thức tĩnh (7): 5
Lambda với điều kiệu (Filtering - BOOLEAN) (8): true
Lambda với các phương thức non-static (9): 12
Lambda với các constructor (10): [1, 3, 5, 7, 9, 11, 13, 15, 17]
```

### 2.1 Các loại Lambda

- **Lambda đối tượng (Object Lambdas):**

1.  Lambda đối tượng triển khai một giao diện chức năng và được lưu trữ trong một biến để sử dụng sau này.

Ví dụ, khi chúng ta gán một biểu thức lambda vào một biến để sau đó sử dụng.

**Example** [ObjectLambda](ObjectInlinesLambda/ObjectLambda.java):

```java
package ObjectInlinesLambda;

public class ObjectLambda {
    public static void main(String[] args) {
        Calculator calc = (a,b) -> a+b;
        int resultOL = calc.add(6, 4);
        System.out.println("Result ObjectLambda: " + resultOL);
    }
}
```

- **Lambda trực tiếp (Inline Lambdas):**

2.  Lambda trực tiếp được truyền trực tiếp như tham số cho các phương thức.

Ví dụ, khi chúng ta truyền một biểu thức lambda vào một phương thức ngay lập tức.

**Example** [InlineLambdas](ObjectInlinesLambda/InlineLambdas.java):

```java
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
```

### 2.2 Sử dụng biến `VAR`

Cú pháp biến cục bộ cho tham số lambda (Local Variable Syntax) là một tính năng trong Java 10 trở lên. Nó cho phép bạn khai báo tham số của một biểu thức lambda mà không cần phải xác định kiểu dữ liệu của biến đó.
Thay vì viết:

```java
(String s) -> { ... }
```

bạn có thể viết:

```java
var s -> { ... }
```

Điều này giúp làm cho mã nguồn ngắn gọn hơn và dễ đọc hơn.

_Example_ [VariableSyntax](ObjectInlinesLambda/VariableSyntax.java)

```java
package ObjectInlinesLambda;

public class VariableSyntax {
    public static void main(String[] args) {
        Calculator vs = (var x, var y) -> x + y;
         int result = vs.add(10, 20);
        System.out.println("Result: " + result);
    }
}
```

```java
Result: 30
```

-- _More..._: `Class` [GENERIC LAMBDA](GenericLambda/VariableSyntax.java) && `Interface` [Calculator](GenericLambda/Calculator.java)

# 3. BUILT-IN FUNCTIONAL INTERFACES - Các giao diện được xây dựng sẵn

1. _Package :_ java.util.**`function`** là một package nằm trong thư viện chuẩn của gói Java.

2. java.util.**`function`** cung cấp các kiểu đích cho các biểu thức **lambda** và tham chiếu phương thức (Method Reference).

3. java.util.**`function`** có hơn 43 loại `Functional Inteface`.

Tuy nhiên trong đó có **4** loại đặc trưng , thường được sử dụng nhiều nhất cho Lambda Expression.

- `Predicate<T>`
- `Consumer<T>`
- `Function<T,R>`
- `Supplier<T>`

### 3.1 `Predicate<T>`

`Predicate<T>` trong _Package :_ java.util.**`function`** đại diện cho một hoạt động kiểm tra điều kiện và trả về một giá trị boolean như kết quả. Nó thường được sử dụng để kiểm tra các điều kiện trong các hoạt động như lọc dữ liệu theo kiểu `<T>`.

Abstract Method được áp dụng nhiều là

```java
// Abstract Method
boolean test(T t)
```

Phương thức này được sử dụng để đánh giá điều kiện (predicate) trên một đối tượng đầu vào (t). Nó kiểm tra xem đối tượng đầu vào có thỏa mãn điều kiện được định nghĩa trong Predicate hay không.

```java
Predicate<Integer> isPositive = (num) -> num > 0;
System.out.println(isPositive.test(5)); // Output: true
System.out.println(isPositive.test(-5)); // Output: false
```

```java
List<String> names = Arrays.asList("John", "Jane", "Steve", "Mary");
names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);
// Output: John, Jane
```

### 3.2 `Consumer<T>`

`Consumer<T>` Giao diện Consumer đại diện cho một hoạt động nhận đối số nhưng không trả về gì cả. Nó thường được sử dụng để tiêu thụ (consume) dữ liệu hoặc thực hiện một hành động với đối tượng đó.

```java
// Abstract Method
boolean test(T t)
```

_Example:_

```java
Consumer<List<String>> printList = (list) -> list.forEach(System.out::println);
List<String> colors = Arrays.asList("Red", "Green", "Blue");
printList.accept(colors);
// Output: Red, Green, Blue
```

```java

```

```java

```

### 3.3 `Function<T,R>`

`Function<T,R>` Giao diện Function đại diện cho một hoạt động nhận đối số và trả về một kết quả cho người gọi. Nó thường được sử dụng để thực hiện các phép biến đổi hoặc tính toán trên dữ liệu.

```java
// Abstract Method
R apply(T t)
```

```java
Function<String, Integer> strLength = (str) -> str.length();
int length = strLength.apply("OpenAI");
System.out.println("Length: " + length); // Output: Length: 6
```

```java
Function<Integer, Boolean> isEven = (num) -> num % 2 == 0;
System.out.println(isEven.apply(3)); // Output: false
System.out.println(isEven.apply(4)); // Output: true
```

### 3.4 `Supplier<T>`

`Supplier<T>` Giao diện Supplier đại diện cho một hoạt động không nhận bất kỳ đối số nào, nhưng trả về một giá trị cho người gọi. Nó thường được sử dụng để cung cấp (supply) dữ liệu hoặc kết quả cho các phần khác của chương trình.

```java
// Abstract Method
T get()
```

```java
Supplier<String> getGreeting = () -> "Hello, World!";
System.out.println(getGreeting.get()); // Output: Hello, World!
```

```java
Supplier<LocalDate> getCurrentDate = LocalDate::now;
System.out.println("Current date: " + getCurrentDate.get()); // Output: Current date: [current date]
```

```java
Supplier<List<Integer>> getNumbers = () -> Arrays.asList(1, 2, 3, 4, 5);
System.out.println(getNumbers.get()); // Output: [1, 2, 3, 4, 5]
```
