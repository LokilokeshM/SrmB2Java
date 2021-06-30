package Day28;

import java.util.ArrayList;


public class ReplaceArray {
	void printArray(ArrayList arrayList)
	{
		for(int index=0; index < arrayList.size(); index++)
			System.out.println(arrayList.get(index));
	}
	public static void main(String[] args) 
	{
		ReplaceArray r = new ReplaceArray();
		r.new Student();
		ArrayList arrayList = new ArrayList();

		arrayList.add("55");
		arrayList.add("25");
		arrayList.add("368");

		System.out.println("Original ArrayList...");
		
			r.printArray(arrayList);
		arrayList.set(1,"6");
		
		System.out.println("ArrayList after replacement...");
			r.printArray(arrayList);
	}
	
	
	
	
	public class Student{
//		int studentNo;
//		String studentName;
//		int age;
//		
//		public Student(int studentNo, String studentName, int age) {
//			super();
//			this.studentNo = studentNo;
//			this.studentName = studentName;
//			this.age = age;
//		}
//		
//		public int getStudentNo() {
//			return studentNo;
//		}
//		public void setStudentNo(int studentNo) {
//			this.studentNo = studentNo;
//		}
//		public String getStudentName() {
//			return studentName;
//		}
//		public void setStudentName(String studentName) {
//			this.studentName = studentName;
//		}
//		public int getAge() {
//			return age;
//		}
//		public void setAge(int age) {
//			this.age = age;
//		}
		
	}
}
