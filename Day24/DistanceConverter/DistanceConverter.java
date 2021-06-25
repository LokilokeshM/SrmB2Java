package Day24.DistanceConverter;

import java.util.logging.Logger;

public class DistanceConverter {
	private static final Logger log = Logger.getLogger(DistanceConverter.class.getName());
	public void DistanceConverter(int v,int ct)
	{
		switch(ct)
		{
		case 1:
			log.info("KiloMeter to Meter-->"+ v*1000);
			break;
		case 2:
			log.info("KiloMeter to millimeter -->"+ v*0.621371);
			break;
		case 3:
			log.info("KiloMeter to Centimeter -->"+ v * 100000);
			break;
		case 4:
			log.info("KiloMeter to nanoMeter -->"+ v *(1e+6));
			break;
		case 5:
			log.info("KiloMeter to Micrometer -->"+ v *(1e+9));
			break;
		default:
			log.info("Enter The Correct Values");
		}
	}
}
