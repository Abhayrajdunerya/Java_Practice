package oops.constructors;

class Case1 {
    Case1() {
        System.out.println("Constructor");
        super(); // CE: super() must be first statement in constructor.
    }
}

class Case2 {
    Case2() {
        super();
        this(); // CE: this() must be first statement in constructor.
        System.out.println("Constructor");
    }
}

class Case3 {
    public void m1() {
        super(); // CE: can't use in methods
        System.out.println("Method");
    }
}
