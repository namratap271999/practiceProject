
public class ThisKeyword {

	public static void main(String[] args) {
		
Test t=new Test();
//t.a=10;
t.print();

	}
}
	
	class Test
	{
		int a;
		public void print()
		{
			int a=20;
			System.out.println(this.a);
		}
	}

