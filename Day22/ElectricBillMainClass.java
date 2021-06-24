package Day22;

import java.util.Scanner;



public class ElectricBillMainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Number");
		int cn=sc.nextInt();
		EBCustomer eb= new CommonFunctions().CheckTheCustomerInEb(cn);
		if(eb!=null)
		{
			if(new CommonFunctions().checkTypeofConnections(eb.getType_of_EBconnection()) == true)
			{
				System.out.println("You Have Domestic Connections");
				System.out.println("Enter The Current Reading");
				int cr= sc.nextInt();
				new CommonFunctions().CalforDomestic(eb.getCurrent_month_reading(),cr);
			}
			if(new CommonFunctions().checkTypeofConnections(eb.getType_of_EBconnection()) == false)
			{
				System.out.println("You Have Commercial Connections");
				System.out.println("Enter The Current Reading");
				int cr= sc.nextInt();
				new CommonFunctions().CalforCommercial(eb.getCurrent_month_reading(),cr);
			}
		}
		else
		{
			System.out.println("No Customer Found");
		}
	}

}
