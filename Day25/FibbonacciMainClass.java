package Day25;

public class FibbonacciMainClass {
	
	
	public static void main(System[] args)
	{
		 try
	     {
	          Fibonacci f = new Fibonacci();
	          f.start();
	          f.sleep(4000);
	     }
	     catch (Exception ex)
	     {
	          ex.printStackTrace();
	     }
	}
}
