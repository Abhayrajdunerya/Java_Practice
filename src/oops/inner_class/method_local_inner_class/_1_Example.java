package oops.inner_class.method_local_inner_class;

class Test {

    public void m1() {

        class Inner {

            public void sum(int x, int y) {
                System.out.println("The sum: " + (x+y));
            }
  
        }

        Inner i = new Inner();
        i.sum(10, 20);
        i.sum(100, 200);
        i.sum(1000, 2000);
    }

    public static void main(String[] args) {
        Test o = new Test();
        o.m1();
    }
}
