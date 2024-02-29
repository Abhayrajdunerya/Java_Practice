package oops.constructors;

abstract class _3_AbstractClassConst {
    int x;
    _3_AbstractClassConst(int x) {
        this.x = x;
    }
}

class Abstest {
    public static void main(String[] args) {
        // _3_AbstractClassConst obj = new _3_AbstractClassConst(3); // CE: can't instanciate
    }
}
