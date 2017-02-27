import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
*/
public class DodecahedronListApp {
   /**
   */
   public static void main(String[] args) throws IOException {
      String listName = "";
      String label = "";
      String color = "";
      double edge;
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         
         Dodecahedron dodObj = new Dodecahedron(label, color, edge);
      }
      // #iHaveNoIdeaWhatImDoing
      Dodecahedron myList = new DodecahedronList(listName, dodObj);
      
      System.out.println(toString());
      System.out.println(summaryInfo());
   }
}