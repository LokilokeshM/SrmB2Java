package Day09_07;

import java.util.Scanner;

public class MenUDrivenExample {
	 public static void main(String[] args) {
		  
		  int choice, num;
		  Scanner n = new Scanner(System.in);
		  System.out.println("Menu....");
		  System.out.println("1. Find positive");
		  System.out.println("2. Odd/Even");
		  System.out.println("Enter the choice : ");
		  choice = n.nextInt();
		 
		  switch(choice) {
		  
		   case 1:
		    System.out.println("Enter number : ");
		    num = n.nextInt();
		    if(num > 0)
		     System.out.println("Positive...");
		    else
		     System.out.println("Negative...");
		    break;
		   case 2:
		    System.out.println("Enter number : ");
		    num = n.nextInt();
		    if(num%2 == 0)
		     System.out.println("Even...");
		    else
		     System.out.println("Odd...");
		    break;
		   default:
		    System.out.println("Wrong choice..");
		  }
	 }
}