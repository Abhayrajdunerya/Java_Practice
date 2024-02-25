package oops.inner_class.anonymous_inner_class;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
    
}

class ThreadDemo {
    public static void main(String[] args) {
        // MyRunnable r = new MyRunnable();
        // Thread t = new Thread(r);
        // t.start();

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Main Thread: " + i);
        // }

        // Runnable r2 = new Runnable() {
        //     @Override
        //     public void run() {
        //        for (int i = 0; i < 10; i++) {
        //             System.out.println("Child Thread: " + i);
        //        }
        //     }  
        // };

        // Thread t2 = new Thread(r2);
        // t2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread new: " + i);
                }
            }
            
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }

        
    }
}
