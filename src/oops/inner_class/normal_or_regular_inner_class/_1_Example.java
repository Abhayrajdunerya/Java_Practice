package oops.inner_class.normal_or_regular_inner_class;

class Outer {

    class Inner {
        // Inner class main method is not visible -----------------------

        // public static void main(String[] args) {
        //     System.out.println("Inner class main method");
        // }

        static int staticVar = 12;

        public static void staticM1() {
            System.out.println("Inner class static method, staticVar = " + staticVar);
        }

        public void m1() {
            System.out.println("Inner class instance method");
        }
        
    }

    public void m2() {
        Inner i = new Inner();
        i.m1();
    }

    public static void main(String[] args) {
        System.out.println("Outer class main method");
        Inner.staticM1();

        Outer o = new Outer();
        // Inner i = new Inner();    // ERROR

        Outer.Inner i = o.new Inner();  // valid

        i.m1();
        new Outer().new Inner().m1();

        o.m2();
    }

}

class Test {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        i.m1();
    }
}


/*
 * -------------- Accessing Inner class code ------------------
 * 
 *  From static area of outer class [OR]
 *  From outside of outer class
 *  
 *  Outer o = new Outer();
 *  Outer.Inner i = o.new Inner();
 *  i.m1();
 * 
 * ------------------------------------------------------------
 * 
 *  From instance area of Outer class
 *  Inner i = new Inner();
 *  i.m1();
 * 
 */