package Unit_01;
public class P3_Task01_VariablesAndDataTypesInJava
{
   static int q=11;//global variable
   int p=10;//global variable
   public static void main(String[] args)
   {
	    
	    //Datatypes
	    int a=5,c;
	    char e;
	    double s;
	    System.out.println("Value of Local variable a:"+ a);
	    System.out.println("Value of Global Variable q: "+ q);//displaying global variable
	    
	    
	    //System.out.println(p);
	    
	    //TypeConversion
	    double f;
	    int i=10;
	    f=i;
	    System.out.println("\n");
	    System.out.println("Value after type conversion: "+ f);
	    
	    //TypeCasting
	    double b=20.25;
	    c=(int)b;
	    System.out.println("\n");
	   System.out.println("Value after type casting:"+ c);
   }
}
