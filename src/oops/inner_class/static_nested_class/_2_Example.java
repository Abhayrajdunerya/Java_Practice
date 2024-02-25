package oops.inner_class.static_nested_class;

class Test_2 {
    int x = 10;
    static int y = 20;

    static class Nested_2 {
        public static void main(String[] args) {
            // System.out.println(x);   // ERROR
            System.out.println(y);
        }
    }
}
