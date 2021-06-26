package Day25;

import java.util.Random;

class First extends Thread
{
	public void run()
	{
		int num=0;
		Random r=new Random();
		try
		{
			for(int i=0;i<5;i++)
			{
				num=r.nextInt(100);
				System.out.println("first thread generated number is"+num);
				Thread t2=new Thread (new Second(num));
				t2.start();
				Thread t3=new Thread(new Third(num));
				t3.start();
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
	}
}