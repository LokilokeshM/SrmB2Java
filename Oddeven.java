package Basic;

public class Oddeven {


		// Function to count digits
		static int countEvenOdd(int n)
		{
		    int even_count = 0;
		    int odd_count = 0;
		    while (n > 0)
		    {
		    	
		        int rem = n % 10;
		        if (rem % 2 == 0)
		            even_count++;
		        else
		            odd_count++;
		        
		    }
		    System.out.println ( "Even count : " +
		                              even_count);
		    System.out.println ( "Odd count : " +
		                              odd_count);
		    if (even_count % 2 == 0 &&
		         odd_count % 2 != 0)
		        return 1;
		    else
		        return 0;
		}
		 
		    // Driver Code
		    public static void main (String[] args)
		    {
		    int n;
		    n = 456789;
		    int t = countEvenOdd(n);
		     
		    if (t == 1)
		        System.out.println ( "YES" );
		    else
		        System.out.println( "NO") ;
		         
		    }
		
		
	}


