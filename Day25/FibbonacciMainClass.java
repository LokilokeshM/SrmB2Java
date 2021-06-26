package Day25;

public class FibbonacciMainClass {
	
	
	public static void main(System[] args)
	{
		 try
	     {
	          Fibonacci fib = new Fibonacci();
	          fib.start();
	          fib.sleep(4000);
	     }
	     catch (Exception ex)
	     {
	          ex.printStackTrace();
	     }
	}
}
