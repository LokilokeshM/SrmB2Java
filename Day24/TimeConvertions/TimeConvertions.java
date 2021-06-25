package Day24.TimeConvertions;

import java.util.logging.Logger;


public class TimeConvertions {
	private static final Logger log = Logger.getLogger(TimeConvertions.class.getName());
	public void TimeConverter(int v,int ct)
	{
		switch(ct)
		{
		case 1:
			log.info("Hour to Second-->"+ v*3600);
			break;
		case 2:
			log.info("Hour to Minute -->"+ v*60	);
			break;
		case 3:
			log.info("Hour to MicroSecond -->"+ v *(3.6e+9));
			break;
		default:
			log.info("Enter The Correct Values");
		}
	}
}
