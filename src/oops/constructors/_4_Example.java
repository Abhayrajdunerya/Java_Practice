package oops.constructors;

class Test_4 {
    Test_4(double d) {
        this(10);
        System.out.println("double-arg constructor");
    }

    Test_4(int i) {
        this();
        System.out.println("int-arg constructor");
    }

    Test_4() {
        System.out.println("no-arg constructor");
    }

    public static void main(String[] args) {
        Test_4 t1 = new Test_4(10.5);   // no-arg
        System.out.println();             // int-arg
                                          // double-arg
        
        Test_4 t2 = new Test_4(10);     // no-arg
        System.out.println();             // int-arg
        
        Test_4 t3 = new Test_4(10);     // no-arg
    }
}
