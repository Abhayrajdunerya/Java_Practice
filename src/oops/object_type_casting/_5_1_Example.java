package oops.object_type_casting;

public class _5_1_Example {
    public static void main(String[] args) {
        C c = new C();

        c.m1();
        c.m2();
        ((P)c).m1();
        // ((P)c).m2(); // Error

        // It is like
        // P p = new C();
        // p.m2();
    }
}

class P {
    public void m1() { }
}

class C extends P {
    public void m2() { }
}
