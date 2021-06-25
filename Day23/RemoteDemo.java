package Day23;

interface TVRemote
{
	void signalStrength();
}
interface SmartTVRemote extends TVRemote
{
	void poweron();
	void poweroff();
}
class TV implements SmartTVRemote
{

	public void signalStrength() {
		System.out.println("Strength is Weak!!May be Cloudy Outside");
		
	}

	public void poweron() {
		System.out.println("The TV is On");
		
	}

	public void poweroff() {
		System.out.println("The TV is OFF");
		
	}
	
}
public class RemoteDemo {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.poweron();
		ob.signalStrength();
		ob.poweroff();
	}

}
