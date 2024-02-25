package oops.inner_class.others;

interface Map {

    interface Entry {   // public & static

    }

}


interface Outer {

    public void m1();

    interface Inner {

        public void m2();

    }

}

class Test_3_1 implements Outer {

    @Override
    public void m1() {
        System.out.println("Outer interface method implementation");
    }
    
}

class Test_3_2 implements Outer.Inner {

    @Override
    public void m2() {
        System.out.println("Inner interface method implementation");
    }
    
}

class Test_3 {
    public static void main(String[] args) {
        Test_3_1 t1 = new Test_3_1();
        t1.m1();

        Test_3_2 t2 = new Test_3_2();
        t2.m2();
    }
}