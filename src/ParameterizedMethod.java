
public class ParameterizedMethod {

	public static void main(String[] args) {
		parMethod(10);
		Another.AnotherMethod(20);
		new Another().A(30);
		

	}
	public static void parMethod(int a)
	{
		System.out.println(a);
	}

}

class Another
{
	public static void AnotherMethod(int a)
	{
		System.out.println(a);
		
	}
	void A(int a)
	{
		System.out.println(a);
	}
}