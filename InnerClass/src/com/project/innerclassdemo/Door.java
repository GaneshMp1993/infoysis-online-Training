package com.project.innerclassdemo;

public class Door {
	Lock lock;//inner class
	
	public Door() {
	lock=new Lock(false);
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop is closed,,,,,,please visit tomorrow,,,,");
		}
		else {
			System.out.println("Welcome,,,,We are open,,,,,,,,,");
		}
	}
	
	

}
