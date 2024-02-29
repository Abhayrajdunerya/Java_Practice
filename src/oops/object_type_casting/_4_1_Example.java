package oops.object_type_casting;

class Base1 extends Object {}
class Base2 extends Object {}

class Der1 extends Base1 {}
class Der2 extends Base1 {}

class Der3 extends Base2 {}
class Der4 extends Base2 {}

class Test_4_1 {
    public static void main(String[] args) {
        Base2 b = new Der4();

        Der4 d = (Der4) b;
        // Base1 b1 = (Base1) b; // Error: Rule 1 failed
        Base2 b2 = (Base2) b;
        // Object o = (Der3) b; // Exception: Rule 3 failed
        // Base2 b3 = (Base1) b; // Error: Rule 1 failed
    }
}
