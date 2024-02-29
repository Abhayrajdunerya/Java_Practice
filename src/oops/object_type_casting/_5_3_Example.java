package oops.object_type_casting;

public class _5_3_Example {
    public static void main(String[] args) {
        C_ c = new C_();

        c.m1();             // C
        ((B_)c).m1();       // B
        ((A_)((B_)c)).m1(); // A
    }
}

class A_ {
    public static void m1() { System.out.println("A"); }
}

class B_ extends A_ {
    public static void m1() { System.out.println("B"); }
}
 
class C_ extends B_ {
    public static void m1() { System.out.println("C"); }
}
