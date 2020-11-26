package hw5;

import java.util.logging.Level;
import java.util.logging.Logger;


public class BarrierImpl implements Barrier {
    
    // Num of synchronized thread  
    private int threadCount = 0 ;
    // Counter for threads
    private int counter = 0;

    /*
    ** BarrierImpl constructor
    */
    public BarrierImpl (int threadCount) {
        this.threadCount = threadCount;
    }
    
    @Override
    public void waitForOthers() {
        try {
            counter ++ ;
            System.out.println(counter);                                  
            
            if (counter == threadCount) {
                freeAll(); 
                //System.out.println(Thread.currentThread().toString());
                System.out.println("FREE ALL THREADS");
         
            } else {                
                //System.out.println(Thread.currentThread().toString());              
                wait();               
                
            }
                                              
        } catch (InterruptedException ex) {
            Logger.getLogger(BarrierImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public synchronized void freeAll() {
        // To free all threads after last one has reached
        notifyAll();
    }
    
    
}
