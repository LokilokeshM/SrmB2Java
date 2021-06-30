package Day26;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args)
    {
  
        Stack stack1 = new Stack();
  
        Stack<String> Stack2 = new Stack<String>();
         stack1.add("ravi");
         stack1.add("shiva");
         stack1.add("muthu");
         stack1.add("Ram");
         
         System.out.println("Stack Representation");
         System.out.println(stack1);
         
         System.out.println("Updating the Stack ");
        stack1.push(4);
        
        stack1.push("kishor");
        stack1.push("lokesh");
        System.out.println(stack1);
        
        System.out.println("Stack Representation");
 
        
       Stack2.add("Java");
       Stack2.add("C");
       Stack2.add("Angular");
       Stack2.add("React");
       
        System.out.println("Removing Elements");

        Stack2.pop();
        Stack2.pop();
        System.out.println(Stack2);
    }

	
		
}
