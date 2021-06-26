package Day25;

import java.util.*;
class Second implements Runnable
{
	public int x;
	
	public Second(int x)
	{
		this.x=x;
	}
	public void run(){
		System.out.println("Second thread:Square of the number is"+ x*x);
	}
}

class Third implements Runnable
{
	public int x;
	
	public Third(int x)
	{
		this.x=x;
	}
	
	public void run()
	{
		System.out.println("third thread:Cube of the number is"+ x*x*x);
	}
}

