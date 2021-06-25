package Day24;

import java.util.Scanner;
import java.util.logging.Logger;

import Day24.DistanceConverter.DistanceConverter;
import Day24.TimeConvertions.TimeConvertions;
import Day24.ConvertCurrency.ConvertCurrency;

public class ConvertionsMainClass {

	public static void main(String[] args) {
		final Logger log = Logger.getLogger(ConvertionsMainClass.class.getName());		
		Scanner sc =new Scanner(System.in);
		try
		{
			try {
				log.info("Enter The Inr Number");	
				int inr=sc.nextInt();
				log.info("Choose to perform Currency Convertions");
				log.info("1. Doller Convertions");
				log.info("2. Euro Convertions");
				log.info("3. Yen Convertions");
				int c= sc.nextInt();
				new ConvertCurrency().ConvertCurrency(inr, c);;	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try {
				log.info("Enter The Distance Number");	
				int km=sc.nextInt();
				log.info("Choose to perform Kilometer Convertions");
				log.info("1. Meter Convertions");
				log.info("2. Millimeter Convertions");
				log.info("3. Centemeter Convertions");
				log.info("4. nanoMeter Convertions");
				log.info("5. Micrometer Convertions");
				int val= sc.nextInt();
				new DistanceConverter().DistanceConverter(km, val);;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				log.info("Enter The Time Converter");	
				int h=sc.nextInt();
				log.info("Choose to perform Hours Convertions");
				log.info("1. Second Convertions");
				log.info("2. Minute Convertions");
				log.info("3. MicroSecond Convertions");
				int v= sc.nextInt();
				new TimeConvertions().TimeConverter(h, v);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
