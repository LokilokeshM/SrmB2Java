package Day1_07;

import java.util.Comparator;

class Student{
    
    private int marks;
    private String name;
    
    // constructor
    public Student(int value, String name) 
    {
        this.marks=value;
        this.name=name;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
      
    public int getMarks() 
    {
        return marks;
    }
      
}
class myMarksComparator implements Comparator<Student>
{
    
    public int compare(Student s1, Student s2) 
    {
        return s1.getMarks()-s2.getMarks();
    }
}