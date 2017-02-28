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
      ArrayList<Dodecahedron> dodObjList = new ArrayList<Dodecahedron>();
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
         dodObjList.add(dodObj);
      }
      // #iHaveNoIdeaWhatImDoing
      DodecahedronList myList = new DodecahedronList(listName, dodObjList);
      
      System.out.println(myList.toString());
      System.out.println(myList.summaryInfo());
   }
}