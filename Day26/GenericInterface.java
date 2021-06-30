package Day26;

public class GenericInterface {
	  public static void main(String args[]) {
	         Integer Digits[] = { 15, 85, 35, 89, 25 };
	         Character Letter[] = { 'A', 'C', 'P', 'B', 'M' };
	         String Names[] = {"Ram", "Sri", "Rai","Shri"};
	         MinMaxImpl<Integer> intMinMax = new MinMaxImpl<Integer>(Digits);
	         MinMaxImpl<Character> charMinMax = new MinMaxImpl<Character>(Letter);
	         MinMaxImpl<String> strMinMax = new MinMaxImpl<String>(Names);
	         System.out.println("Max value in Digits: " + intMinMax.max());
	         System.out.println("Min value in Digits: " + intMinMax.min());
	         System.out.println("Max value in Letters: " + charMinMax.max());
	         System.out.println("Min value in Letters: " + charMinMax.min());
	         System.out.println("Max value in Names: " + strMinMax.max());
	         System.out.println("Min value in Names: " + strMinMax.min());
	     }
	}

	interface MinMax<T extends Comparable<T>> {
	     T min();

	     T max();
	}

	class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	     T[] vals;

	     MinMaxImpl(T[] o) {
	         vals = o;
	     }

	     public T min() {
	         T v = vals[0];

	         for (int i = 1; i < vals.length; i++) {
	             if (vals[i].compareTo(v) < 0) {
	                  v = vals[i];
	             }
	         }

	          return v;
	     }

	     public T max() {
	          T v = vals[0];

	          for (int i = 1; i < vals.length; i++) {
	             if (vals[i].compareTo(v) > 0) {
	                  v = vals[i];
	             }
	          }

	          return v;
	     }
}
