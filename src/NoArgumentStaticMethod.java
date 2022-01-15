
public class NoArgumentStaticMethod {
	 static int a;

	public static void main(String[] args) {
		System.out.println("Inside main");
		MyMethod();
		

	}
	public static void MyMethod()
	
	{
		int a=10;
		System.out.println("Inside MyMethod");
		System.out.println( NoArgumentStaticMethod.a);
		System.out.println( a);
	}

}
