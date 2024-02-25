package oops.inner_class.static_nested_class;

import oops.inner_class.static_nested_class.Outer.Nested;

class Outer {

    static class Nested {
        public void m1() {
            System.out.println("Static nested class method");
        }
    }

    public static void main(String[] args) {
        Nested n = new Nested();
        n.m1();
    }

}

class Test {
    public static void main(String[] args) {
        Nested n = new Nested();
        n.m1();
    }
}
