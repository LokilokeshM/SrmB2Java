package Day1_07;

import java.io.*;
import java.util.*;

class ComparatorSort {
  
    public static void main (String[] args){
          
        TreeSet<Student> set = new TreeSet<Student>(new myMarksComparator());
          
        set.add(new Student(50,"a"));
        set.add(new Student(41,"b"));
        set.add(new Student(34,"c"));
        set.add(new Student(90,"d"));
          
        System.out.println("increasing Order with the Marks");
        for(Student ele: set)
        {	
        	
            System.out.print(ele.getName()+"        "+ele.getMarks());
            System.out.println();
        }
          
    }
}