package Day25;

public class AliveAndJoin1 implements Runnable 
{ 
    Thread t; 
    AliveAndJoin1(String n) 
    { 
       t=new Thread(this,n); 
       System.out.println("Thread is :"+t); 
    }
    
    public void run() 
    { 
    	try 
        { 
           for(int i=1;i<=5;i++) 
           { 
             System.out.println(t.getName()+":"+i); 
             t.sleep(200); 
           } 
        }                  
        catch(InterruptedException e) 
        { 
        	System.out.println(t.getName()+" is Interrupted"); 
        } 
    } 
} 