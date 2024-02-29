package oops.object_type_casting;

public class _6_Example {
    public static void main(String[] args) {
        C1 c = new C1();

        System.out.println(c.x);                // 999
        System.out.println(((B1)c).x);          // 888
        System.out.println(((A1)((B1)c)).x);    // 777
    }
}

class A1 {
    int x = 777;
}

class B1 extends A1 {
    int x = 888;
}

class C1 extends B1 {
    int x = 999;
}
