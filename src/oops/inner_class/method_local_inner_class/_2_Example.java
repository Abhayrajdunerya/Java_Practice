package oops.inner_class.method_local_inner_class;

class Test_2 {

    int x = 10;
    static int y = 20;

    public void m1() {
        int z = 30;
        final int a = 40;

        class Inner {           // final | abstract | strict..
        
            public void m2() {
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
                System.out.println(a);
            }

            public static void m3() {
                // System.out.println(x);  // ERROR - Cannot make a static reference to the non-static field x
                System.out.println(y);
                // System.out.println(z);  // ERROR - 
                System.out.println(a);
            }
        }

        Inner i = new Inner();
        i.m2();
        System.out.println();
        Inner.m3();

    }

    public static void m2() {
        int z = 30;
        final int a = 40;

        class Inner {
        
            public void m2() {
                // System.out.println(x);  // ERROR - Cannot make a static reference to the non-static field x
                System.out.println(y);
                System.out.println(z);
                System.out.println(a);
            }

            public static void m3() {
                // System.out.println(x);  // ERROR - Cannot make a static reference to the non-static field x
                System.out.println(y);
                // System.out.println(z);  // ERROR - 
                System.out.println(a);
            }
        }

        Inner i = new Inner();
        i.m2();
        System.out.println();
        Inner.m3();
    }

    public static void main(String[] args) {
        Test_2 t = new Test_2();
        t.m1();
        System.out.println("\n---------------------------------");
        Test_2.m2();

    }
}
