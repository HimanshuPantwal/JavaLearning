package Unit_03;
import java.util.*;
//exception handling
//-->use of try and catch block
//-->why try and catch block;
//-->difference btw error exception
//-->use of throw keyword
//-->use of final
/*file handling 
 1.read input from a file instead of console
 2.making a log of execution pattern
 3.multi threading
*/
//Java Program to Demonstrate Exception is Thrown
//How the runTime System Searches Call-Stack
//to Find Appropriate Exception Handler

//Class
//ExceptionThrown

public class P14_ExceptionHandling {
 public static void main(String arg[])
 {
	 exception ex=new exception();
	 ex.BasicException();
	 ex.Division();
	 ex.outOfBound();
	// ex.stackoverflow(); *it cannot be resolved using exception handling as well
	 ex.mismatch();
 }
}
 class exception{
	 Scanner p=new Scanner(System.in);
	 void BasicException(){
	 int a=0;
	 int b=100/a;
	 }
	 
	 void Division() {
		 int a=100;
		 int b=0;
		
		 try {
			 int res=a/b; 
		 }
		 catch(Exception e)
		 {
			 System.out.println("exception occured");
		 }
	 }
	 void outOfBound() {
		 int[] arr=new int[4];
		 arr[0]=4;
		 arr[1]=5;
		 arr[2]=8;
		 arr[3]=9;
		 try {
			 int x=arr[3];
			 System.out.println("value is:"+x);
		 }
		 catch(Exception ex) {
			 System.out.println("out of bound");
		 }
	 }
	 void stackoverflow() {
		 try {
			 stackoverflow();
		 }
		 catch(Exception x)
		 {
			 System.out.println("stack overflow");
		 }
	 }
	 void mismatch() {
		 try {
			 System.out.println("enter the number");
			 int x=p.nextInt();
		 }
		 catch(Exception e) {
			 System.out.println("wrong input");
		 }
	 }
}