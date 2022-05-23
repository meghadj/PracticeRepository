import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws ArithmeticException {
		    int x, y, result=0;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter two numbers");
		    x=sc.nextInt();
		    y=sc.nextInt();
		    try {
		    result=x/y;
		    }
		    catch (ArithmeticException e) {
		        System.out.println("Cannot divide by zero");
		    }
		    finally {
		    System.out.println("Result is "+result);
		    System.out.println("Hello world");
		    }

	}

}
