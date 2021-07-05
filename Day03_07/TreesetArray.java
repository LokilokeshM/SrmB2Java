package Day03_07;

import java.util.*;
public class TreesetArray {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements of array: ");
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements: ");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		System.out.println("Array Elements: ");
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i : arr) {
            if (!treeSet.add(i)) {
                System.out.println("Duplicate Entry is: " + i);
            }
        }
        System.out.println("TreeSet: " +treeSet);

	sc.close();

	}

}
