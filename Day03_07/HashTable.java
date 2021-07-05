package Day03_07;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable {
	public static void main(String[] args){
        Hashtable<String,Double> ht=new Hashtable<String,Double>();
        ht.put("a", 75000.00);
        ht.put("b",5000.25);
        ht.put("c",25000.00);
        ht.put("d",8000.25);
        System.out.println(ht);
        Set<String> keys=ht.keySet();
        Iterator<String> itr=keys.iterator();
        while(itr.hasNext()){
            String str=itr.next();
            System.out.println("Key: "+str+ " Value: "+ht.get(str));
        }
    }
}
