package Day25;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {
		 public static void main(String[] args){
		   final String r1 = "Lokiii";
		   final String r2 = "Lokesh";
		 
		   Thread t1 = new Thread() {
		     public void run(){
		       synchronized(r1){
		        System.out.println("Thread 1: Locked r1");
		        try{ 
		        	Thread.sleep(100);
		        	} 
		        catch(Exception e) {
		        	e.printStackTrace();
		        }
		      synchronized(r2){
		        System.out.println("Thread 1: Locked r2");
		        }
		     }
		  }
		}; 
		t1.start();
		}
	}