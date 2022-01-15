import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		
		new ExceptionHandling().takeNumber();
		
		}
	
	void takeNumber()
	
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int firstNumber=sc.nextInt();
		System.out.println("Enter Second Number:");
		int secondNumber=sc.nextInt();
		try {
		divide(firstNumber,secondNumber);
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
	}
    
	void divide(int firstNumber,int secondNumber)
	{
		
		int result=firstNumber/secondNumber;
		display(result);
		
		
		
	}
	void display(int result)
	{
		
		System.out.println("Division is :" +result);
		
	}
}
