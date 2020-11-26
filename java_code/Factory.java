package hw5;


public class Factory {

    final static int THREAD_COUNT = 10;
    
    public static void main(String[] args) {
                   
        Barrier barrier = new BarrierImpl(THREAD_COUNT);
        
        
        for (int i = 0; i < THREAD_COUNT; i++) {
            (new Worker(barrier, i * 500)).start();
        }
        
        // just for testing
        /*
        new Worker(barrier, 1000).start();
        new Worker(barrier, 2500).start();
        new Worker(barrier, 5000).start();   
        */
        
        // Output
        /*
        run:
        Thread[Thread-1,5,main]started
        Thread[Thread-5,5,main]started
        Thread[Thread-4,5,main]started
        Thread[Thread-3,5,main]started
        Thread[Thread-0,5,main]started
        Thread[Thread-2,5,main]started
        Thread[Thread-0,5,main]waiting on barrier
        Thread[Thread-7,5,main]started
        Thread[Thread-8,5,main]started
        Thread[Thread-6,5,main]started
        1
        Thread[Thread-9,5,main]started
        Thread[Thread-1,5,main]waiting on barrier
        2
        Thread[Thread-2,5,main]waiting on barrier
        3
        Thread[Thread-3,5,main]waiting on barrier
        4
        Thread[Thread-4,5,main]waiting on barrier
        5
        Thread[Thread-5,5,main]waiting on barrier
        6
        Thread[Thread-6,5,main]waiting on barrier
        7
        Thread[Thread-7,5,main]waiting on barrier
        8
        Thread[Thread-8,5,main]waiting on barrier
        9
        Thread[Thread-9,5,main]waiting on barrier
        10
        FREE ALL THREADS
        Thread[Thread-0,5,main]has been released
        Thread[Thread-1,5,main]has been released
        Thread[Thread-2,5,main]has been released
        Thread[Thread-3,5,main]has been released
        Thread[Thread-4,5,main]has been released
        Thread[Thread-5,5,main]has been released
        Thread[Thread-6,5,main]has been released
        Thread[Thread-7,5,main]has been released
        Thread[Thread-8,5,main]has been released
        Thread[Thread-9,5,main]has been released
        BUILD SUCCESSFUL (total time: 9 seconds)

        */
      
      
    }
    
}
