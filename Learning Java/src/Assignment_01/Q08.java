package Assignment_01;

/* Q8. WAP in java, to delete index=3, element from the given array 
mentioned below. 
Int[] arr = {1,2,3,4,5,6,7,8,9}
Note: Non relevance places would be filled with zeros.
*/


import java.util.*;

public class Q08 {
	
		public static void main(String[] agrs) {
			
			System.out.println("Question 08");
			System.out.println("Himanshu Pantwal_F_  20011658");
			System.out.println("\t");
			
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the size of array:");
			int n=in.nextInt();
			int arr[]=new int[n];
			
			System.out.println("Enter the Element of array:");
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			
			int m;
			System.out.println("Enter the index whose element is to be deleted");
			m=in.nextInt();
			
			System.out.println("Deleted Element="+arr[m]);
			
			for(int i=m;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			
			System.out.println("Array after the number is deleted");
			for(int i=0;i<n-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
