package Lambda;

import java.util.List;

public interface myFunctionInterF {
    interface MyFunctionalInterface1 {
        void myMethod1();
    }
    interface MyFunctionalInterface2 {
        int myMethod2(int x);
    }
    interface MyFunctionalInterface3 {
        int myMethod3(int x, int y);
    }
    interface MyFunctionalInterface4 {
        int myMethod4(int x);
    }
    interface MyFunctionalInterface5 {
        int myMethod5(int x);
    }
    interface MyFunctionalInterface6 {
        void myMethod6(String x);
    }
    interface MyFunctionalInterface7 {
        int myMethod7(int x);
    }
    interface MyFunctionalInterface8 {
        //! 8. Lambda với điều kiệu (Filtering - BOOLEAN)
        boolean myMethod8(int x);
    }
    interface MyFunctionalInterface9 {
        //! 9. Lambda với các phương thức non-static
        int myMethod9(String s);
    }
    interface MyFunctionalInterface10 {
        //! 10. Lambda với các constructor 
        List<Integer> myMethod10(Integer[] x);
    }
}
