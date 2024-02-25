package oops.inner_class.anonymous_inner_class;

class PopCorn {
    public void taste() {
        System.out.println("salty");
    }
}

class SubPopCorn extends PopCorn {
    @Override
    public void taste() {
        System.out.println("spicy");
    }
}

class Test {
    public static void main(String[] args) {

        PopCorn p1 = new PopCorn();

        PopCorn p2 = new PopCorn() {
            public void taste() {
                System.out.println("spicy");
            }
        };

        PopCorn p3 = new PopCorn() {
            public void taste() {
                System.out.println("sweet");
            }
        };

        p1.taste();
        p2.taste();
        p3.taste();

        
    }
}


class _1_Example {

    PopCorn p = new PopCorn();
    PopCorn p1 = new PopCorn() {

    };

    Thread t = new Thread();
    Thread t1 = new Thread() {

    };

    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello");
        }
        
    };
}
