package package1;

public class Test11_1 

{
//global variables
	static int i=20;
	static String s="Java";
	
	//non static variable
	int j=30;
	
	
	public static void main(String[] args) 
	{
		//Local Variables
		int i=10;
		String a="Selenium";
		
		//Below statement prints value of local variable i bcoz methods gives preference to local variables
		System.out.println(i);
		
		//Below statement prints value of global variable i
		System.out.println(Test11_1.i);
		
		//creating an instance of a class to access non static member in static method
		Test11_1 d=new Test11_1();
		//Below statement prints value of non static global variable j
		System.out.println(d.j);
		
		
	}

}