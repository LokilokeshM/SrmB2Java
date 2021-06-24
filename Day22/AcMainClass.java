package Day22;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jdk.internal.org.jline.utils.Log;

public class AcMainClass {

	public static void main(String[] args) {
		
		
	ClassRoom cr = new ClassRoom(201, "Dulex", "Chennai", "yes");
	
	List<ClassRoom> lcr= new ArrayList<ClassRoom>();
	
	lcr.add(new ClassRoom(201, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(202, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(203, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(204, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(205, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(206, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(207, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(208, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(209, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(210, "Dulex", "Chennai", "yes"));
	lcr.add(new ClassRoom(201, "Dulex", "Chennai", "yes"));
	
	Iterator itr = lcr.iterator();
	while(itr.hasNext())
	{
		Log.info(itr.next());
	}
	}

}
