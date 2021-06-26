package Day25;

import java.io.*;
import java.util.Scanner;
class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
        	  int n1=0,n2=1,n3,i,count=10;    
        	  System.out.print(n1+" "+n2);//printing 0 and 1    
        	     
        	  for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        	  {    
        	   n3=n1+n2;    
        	   System.out.print(" "+n3);    
        	   n1=n2;    
        	   n2=n3;    
        	  }    
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
