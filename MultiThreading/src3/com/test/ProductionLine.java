package com.test;

/**
The following ProductionLine example consists of a Factory thread, which produces parts 
and puts them in a Bin, and a Worker thread, which takes the parts from the Bin and uses 
them to create a product. The Factory must produce each part in a specific sequence and put 
it in the Bin, while the Worker must take each new part from the Bin, and use it in the 
appropriate sequence to make the product. Note that neither the Factory thread nor the Worker 
thread has any knowledge of what the other thread is doing; each thread only knows how to 
perform its specific function. This is a just-in-time system, and the Bin can hold only 
one part at a time, so the goal of the application is to synchronize the actions of the Factory 
and Worker threads. The Factory thread must not put a new part in the Bin before the 
Worker takes the previous part out, as the resulting product would be missing a part. 
Likewise, the Worker must not try to take a part out of the Bin if no new part is available
**/

public class ProductionLine {
	public static void main(String[] args) {
        Bin bin = new Bin();  // create a bin
        Factory f1 = new Factory(bin, 1); // & factory
        Worker w1 = new Worker(bin, 1); // create worker
        System.out.println("nFactory thread is " + 
                            f1.getName());
        System.out.println("Worker thread is " + 
                            w1.getName() + "n");
        
        System.out.println("Starting production line...n");

        f1.start();  // start factory thread
        w1.start();  // start worker thread
    }
}