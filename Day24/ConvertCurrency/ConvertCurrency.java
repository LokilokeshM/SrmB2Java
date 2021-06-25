package Day24.ConvertCurrency;

import java.util.logging.Logger;



public class ConvertCurrency {

	private static final Logger log = Logger.getLogger(ConvertCurrency.class.getName());
	public void ConvertCurrency(int v , int ct)
	{
		switch(ct)
		{
		case 1:
			log.info("Doller Convertions -->"+ v*0.013);
			break;
		case 2:
			log.info("Euro Convertions -->"+ v*0.011);
			break;
		case 3:
			log.info("Convertions of Yen -->"+ v * 1.49);
			break;
		default:
			log.info("Enter The Correct Values");
		}
	}
}
