import java.util.Scanner;
public class Calculator {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double number1;
		double number2;
		double sum;
		double difference;
		double product;
		double quotient;
		
		System.out.print("Enter First number: \n");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: \n");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		difference = number1 - number2;
		product = number1 * number2;
		quotient = number1 / number2;
		
		System.out.printf("Hello, you entered %f and %f" , number1 , number2);
		
		System.out.printf("\nSum is %f" ,  sum);
		System.out.printf("\nDifference is %f" ,  difference);
		System.out.printf("\nProduct is %f" ,  product);
		System.out.printf("\nQuotient is %f" ,  quotient);
		
	}
}
