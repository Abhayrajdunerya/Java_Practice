package oops.constructors;

public class _1_Example {

    // 1. If I don't create any constructor myself then default(no arg) constructor is created by JVM with empty implementation.
    // 2. If I creates a single constructor then JVM will not create any default constructor.
    // 3. We can give static & instance method name as className

    _1_Example() {
        System.out.println("No arg constructor");
    }

    _1_Example(int x) {
        System.out.println("Parameterized constructor");
    }

    public void _1_Example() {
        System.out.println("Method: _1_Example()");
    }

    // public static void _1_Example() {

    // }

    public static void main(String[] args) {
        _1_Example obj1 = new _1_Example();
        _1_Example obj2 = new _1_Example(5);
        obj1._1_Example();
    }
}
