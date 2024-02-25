package oops.inner_class.normal_or_regular_inner_class;

class Outer_2 {         // public | default | final | abstract | strict..  are allowed

    int x = 10;


    class Inner_2 {     // public | default | final | abstract | strict.. | private | protected | static  are allowed
        int x = 100;

        public void m1() {
            int x = 1000;
            System.out.println("x = " + x);            // 1000
            System.out.println("this.x = " + this.x);  // 100
            System.out.println("Inner.this.x = " + Inner_2.this.x);   // 100
            System.out.println("Outer.this.x = " + Outer_2.this.x);   // 10
        }
    }

    public static void main(String[] args) {
        new Outer_2().new Inner_2().m1();
    }

}
