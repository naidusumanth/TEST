package Testing;

import java.util.Scanner;

public class Collect {
	public static void main(String []args)
	{
	char operator;
    Double number1, number2, result;

    Scanner input = new Scanner(System.in);
   
    System.out.println("Choose an operator: +, -, *, /");
    operator = input.next().charAt(0);
   
    System.out.println("Enter first number");
    number1 = input.nextDouble();
    System.out.println("Enter second number");
    number2 = input.nextDouble();
    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;


      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

     
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

     
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
    	  try {
    	         assert args.length!= 0;
    	      }
    	      catch (AssertionError e) {
    	         System.out.println(e.getMessage());
    	      }
    	  System.out.println("assertion error");
        break;
    }

}
}



}
