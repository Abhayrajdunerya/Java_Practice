package oops.constructors;

class P {
    String s = "Parent variable";
    static String st = "Parent static var";
}

class C extends P {
    String s = "Child variable";
    static String st = "Child static var";

    public void m1() {
        System.out.println(s);          // child
        System.out.println(this.s);     // child
        System.err.println(super.s);    // parent

        System.out.println(st);          // child
        System.out.println(this.st);     // child
        System.err.println(super.st);    // parent
    }

    public static void m2() {
        // System.out.println(s);          // CE
        // System.out.println(this.s);     // CE
        // System.err.println(super.s);    // CE

        System.out.println(st);          // Child static var
        // System.out.println(this.st);     // CE
        // System.err.println(super.st);    // CE
    }
}

class Test2 {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        System.out.println();
        C.m2();
    }
}
