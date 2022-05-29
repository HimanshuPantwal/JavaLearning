//Identify dependent and non dependent of respective path
//Insert selective task into threads
//start those threads
package Unit_03;

import java.util.Scanner;

public class P16_MultiThreading {
    public static void main(String[] args)
    {
//    	C1 obj1=new C1();
//    	C2 obj2=new C2();
//    	obj1.show1();
//    	obj2.show2();
        Thread t1=new Thread(new T1(),"T1");
        Thread t2=new Thread(new T2(),"T2");
        Thread t3=new Thread(new T3(),"T3");
        t1.start();
        t2.start();
        t3.start();
    }
  
}
class C1{
	void show1()
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
	}
}
class C2{
	void show2()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"-Hey_2!");
		}
	}
}
class T1 extends Thread{
	public void run()
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println(a);
		System.out.println("Done with show1()!");
		obj.close();
	}
}
class T2 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"-Hey_2!");
		}
	}
}
class T3 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"-Hey_3!");
		}
	}
}