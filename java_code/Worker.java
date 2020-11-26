package hw5;


public class Worker extends Thread {
    
    /*
    * Fields
    */
    
    Barrier barrier;
    // This dalay to simulate some work on the thread
    int delay;
       
    public Worker(Barrier barrier, int delay) {
        this.barrier = barrier;   
        this.delay = delay;
    }

    @Override
    public void run() {
        
        try {
                System.out.println(Thread.currentThread().getName()+ " -> started");
                // Simulate doing some work
                Thread.sleep(delay);
                
                // Waiting on a barrier
                System.out.println(Thread.currentThread().getName() + " -> waiting on barrier");
                barrier.waitForOthers();
                
                // Now Simulate doing more work 
                Thread.sleep(delay);
                
                // Thread released
                System.out.println(Thread.currentThread().getName() + " -> has been released");  
                
        } catch(Exception e) {
        
        }
        
    }
    
}
