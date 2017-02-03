import java.util.Scanner;
import java.text.DecimalFormat;
/**
* 
*
* @author perry bunn
* @version 2/2/17
*/
public class SpaceTicket {
   /**
   * 
   *
   * @param args not used.
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter ticket code: ");
      
      String x = userInput.nextLine();
      String price;
      double priceCon
      char category;
      double catCon
      String hour;
      String minutes;
      String month;
      String day;
      String year;
      String seat;
      String description;
      String cost;
      double prize;
      
      if (x.length() >= 25) {
         x = x.trim();
         price = x.substring(0, 9);
         category = x.substring(9, 10);
         if (category == "c") {
         
         } else if (category == "s") {
            cost = price - ;
         } else {
            cost = price;
         }
         hour = x.substring(10, 12);
         minutes = x.substring(12, 14);
         month = x.substring(14, 16);
         day = x.substring(16, 18);
         year = x.substring(18, 22);
         seat = x.substring(22, 25);
         description = x.substring(25);
         prize = Math.random();
         
         DecimalFormat fmtP = new DecimalFormat("$###,###.00");
         DecimalFormat fmtC = new DecimalFormat("$###,###.00"); 
                 
         System.out.println("Space Ticket: " + description);
         System.out.println("Date: " + month + "/" + day + "/" + year + "   Time: " + hour + ":" + minutes + "   Seat: " + seat);
         System.out.println("Price: " + fmtP.format(price) + "   Category: " + category + "   Cost: " + fmtC.format(cost));
         System.out.println("Prize Number: " + prize);
      } else {
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticker code must have at least 25 characters.");
      }
   }
}