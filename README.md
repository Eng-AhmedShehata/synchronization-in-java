# synchronization-in-java
This is a simple example to demonstrate the synchronization topic in java by making multiple threads access the same method that marked with synchronized KEYWORD


### Synchronizing Threads with Java Monitors

### Synchronized Java methods
Java associates a monitor with each object. The monitor enforces mutual exclusive access to synchronized methods invoked on the associated object. When a thread calls a synchronized method on an object, the JVM ckecks the monitor for that object
If the monitor is unowned, ownership is assigned to the calling thread, which is then allowed to proceed with the method call
if the monitor is owned by another thread, the calling thread will be put on hold until the monitor becomes available

### **Important note:**
A thread may call wait(), notify() or notifyAll() on an object, only if it owns the monitor of that object.

To summarize:

- If a class has one ore more synchronized methods, each object of the class gets a queue that holds all threads waiting to execute one of theng the synchronized methods.

- There two ways for a thread to get onto this queue, either by calling the method while another thread is using the object or by calling wait(), while using the object.

- When a synchronized method call returns, or when a method calls wait(), another thread gets access to the object.

- If a thread was put in the queue by a call to wait(), it must be "unfrozen" by a call to notify() before it can be scheduled for execution again.
The synchronization rules are complex, but it is actually quite simple to put them into practice. Just follow these rules:
If two or more threads modify an object, declare the methods that carry out the modification as synchronized.

- If a thread must wait for the state of an object to change, it should wait inside the object, not outside, by entering the synchronized method and calling wait().

- Whenever a method changes the state of an object, it should call notify(). That gives the waiting threads a chance to see if circumstances have changed.
These concepts are emphasized in this advanced threads tutorial, take a look in case things are still blurry for you.
Exercise 2. Make the changes outlined above to the producer-consumer code from exercise 2 and recompile it. It should run successfully this time.

### Java semaphores?
Java offers a counting Semaphore object that simplifies thread synchronization.

### **Resources:**
### **`All detials`** [here](http://www.csc.villanova.edu/~mdamian/threads/javamonitors.html)


