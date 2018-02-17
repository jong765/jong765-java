package com.test;

public class Bin {
	private String contents; // holds 1 part
	private boolean available = false; // is part in bin?

	// Factory puts parts in bin
	public synchronized void putContents(String part) {
		while (available) { // if old part is in bin
			try {
				wait(1000); // wait for Worker to take it
							// The wait() method causes the current thread to wait (possibly forever) 
							// until another thread notifies it of a condition change. 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		contents = part;  // put new part in bin
		available = true; // flag that new part is available
		notifyAll();  // The notifyAll() method notifies all the threads waiting on the monitor 
					  // held by the current thread and wakes them up. Typically, one of the 
					  // waiting threads will grab the monitor and proceed.  
	}

	// Worker takes parts out of bin
	public synchronized String getContents() {
		while (!available) { // if no new parts in bin
			try {
				wait(1000); // wait for Factory to put it
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false; // flag that part is unavailabile
		notifyAll();
		return contents; // return the part to Worker
	}
}