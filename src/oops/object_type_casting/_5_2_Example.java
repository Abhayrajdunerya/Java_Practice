package oops.object_type_casting;

public class _5_2_Example {
    public static void main(String[] args) {
        _C c = new _C();

        c.m1();             // C
        ((_B)c).m1();       // C
        ((_A)((_B)c)).m1(); // C
    }
}

class _A {
    public void m1() { System.out.println("A"); }
}

class _B extends _A {
    public void m1() { System.out.println("B"); }
}
 
class _C extends _B {
    public void m1() { System.out.println("C"); }
}
