import java.util.Scanner;
/**
* 
*
* @author perry bunn
* @version 1/31/17
*/
public class ExpressionEvaluator {
   /**
   *
   *
   * @param args not used.
   */
   public static void main(String[] args) {
      double x;
      double result;
      String numbersLeft;
      String numbersRight;
      String formatted;
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      result = (Math.pow(((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 5))), 2)) 
         / (Math.sqrt(Math.abs(16 * Math.pow(x, 7))) + 1);
      System.out.println("Result: " + result);
      
      
      
      System.out.println("# digits to the left of the decimal point: " 
         + numbersLeft);
      System.out.println("# digits to the right of the decimal point: " 
         + numbersRight);
      System.out.println("Formatted Result: " + formatted);
   }
}