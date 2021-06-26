package Day25;

import java.io.*;
import java.util.Scanner;
class Fibonacci extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               Scanner sc = new Scanner(System.in);

               System.out.print("Enter the Limit for fabonacci: ");

               int n = sc.nextInt();
               System.out.println("\n=================================");
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
