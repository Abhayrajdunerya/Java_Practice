package oops.inner_class.anonymous_inner_class;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        // MyThread t = new MyThread();
        // t.start();

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Main Thread: " + i);
        // }

        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread: " + i);
                }
            }
        };

        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
