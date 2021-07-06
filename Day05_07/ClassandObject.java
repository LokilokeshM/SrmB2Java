package Day05_07;

public class ClassandObject {
	    String breed;
	    String size;
	    int age;
	    String color;

	    public String getInfo() {
	        return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
	    }
	    
	 public static void main(String[] args) {
	    	ClassandObject m = new ClassandObject();
	        m.breed="d";
	        m.size="Small";
	        m.age=2;
	        m.color="white";
	        System.out.println(m.getInfo());
	 }
}

