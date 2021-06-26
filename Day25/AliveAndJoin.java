package Day25;


class AliveAndJoin  
{ 
    public static void main(String args[]) 
    { 
    	AliveAndJoin1 k1=new AliveAndJoin1("AWT Thread"); 
    	k1.t.start(); 
    	while(k1.t.isAlive() ) 
    	{ 
	        try   
	        { 
	        	Thread.sleep(400); 
	        } 
	        catch(InterruptedException e) 
	        { 
	        	e.printStackTrace();  
	        } 
	        try 
	        { 
	        	k1.t.join(); 
	        } 
	        catch(InterruptedException e) 
	        { 
	          e.printStackTrace();
	        } 
    	} 
    	if(!k1.t.isAlive()) 
    		System.out.println("AWT Thread is Over"); 
    } 
} 