package Day26;

public class Restriction <K,V> {
	  private K key;
	  private V value;

	 public Restriction(K key, V value) {
		 this.key=key;
		 this.value=value;
	 }
	 public static void main(String[] args) {
		
		 Restriction<Integer,Character> p= new Restriction<Integer, Character>(1,'A');
		 System.out.println(p.key);
		 System.out.println(p.value);
	 }
}