
public class StaticBlock {

	public static void main(String[] args) {
		System.out.println(A1.a);

	}
}
	
class A1
{
	static int a =12;
	static
	{
		a=78;
		System.out.println(a);
	}
	public static void main(String []args)
	{
		a=76;
		System.out.println(a);
	}
}
