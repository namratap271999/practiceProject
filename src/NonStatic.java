
public class NonStatic {

	public static void main(String[] args) {
		Book b1=new Book();
		b1.bookName="java";
		b1.authorName="abc";
		b1.price=23344.0;
		
		
		Book b2=new Book();		
		b2.bookName="python";
		b2.authorName="xyz";
		b2.price=25544.0;
		
		System.out.println(b1.bookName);
		System.out.println(b1.authorName);
		System.out.println(b1.price);
		System.out.println("------------------------");
		System.out.println(b2.bookName);
		System.out.println(b2.authorName);
		System.out.println(b2.price);

	}
}

	class Book
	{
		String bookName;
		String authorName;
		double price;
		
		
	}

