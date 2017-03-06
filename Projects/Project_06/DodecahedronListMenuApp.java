import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
*/
public class DodecahedronListMenuApp {
   /**
   */
   public static void main(String[] args) throws IOException {
      
      String listName = "*** no list name assigned ***";
      ArrayList<Dodecahedron> dodObj = new ArrayList<Dodecahedron>();
      DodecahedronList dodObjList = new DodecahedronList(listName, dodObj);
      String fileName = "no file Name";
      // create/declare ArrayList Dodecahedron Objects
      // create/declare ArrarList DodecahedronList Objects using list name and ArratList as params in the constructor
      
      String userInput = "";
      Scanner scanInput = new Scanner(System.in);
      
      do {
         String label = "";
         String color = "";
         double edge = 0;
         int index;
         
         userInput = scanInput.nextLine();
         if (userInput.length() == 0) {
            continue;
         }
         userInput = userInput.toUpperCase();
         char userChar = userInput.charAt(0);
         
         switch (userChar) {
            case 'R':
               System.out.print("File name: ");
               fileName = scanInput.nextLine();
               
               dodObjList = dodObjList.readFile(fileName);
               System.out.print("File read in and Dodecahedron List created");
               
               break;
               
            case 'P':
               System.out.println(dodObjList);
               break;
               
            case 'S':
               System.out.println(dodObjList.summaryInfo());
               break;
               
            case 'A':
               System.out.print("Label: ");
               label = scanInput.nextLine();
               System.out.print("Color: ");
               color = scanInput.nextLine();
               System.out.print("Edge: ");
               edge = Double.parseDouble(scanInput.nextLine());
               
               dodObjList.addDodecahedron(label, color, edge);
               
               System.out.print("*** Dodecahedron added ***");
               break;
               
            case 'D':
               System.out.print("Label: ");
               label = scanInput.nextLine();
               
               dodObjList.deleteDodecahedron(label);
               
               if (dodObjList.deleteDodecahedron(label) != null) {
                  System.out.println("\"" + label + "\" deleted");
               } else {
                  System.out.println("\"" + label + "\" not found");
               }
               break;
               
            case 'F':
               System.out.print("Label: ");
               label = scanInput.nextLine();
               dodObjList.findDodecahedron(label);
               if (index != null) {
                  dodObjList.get(index).toString();
               } else {
                  System.out.println("\"" + label + "\" not found");
               }
               break;
               
            case 'Q': case 'q':
               break;
            
            default:
               // loop again;
         }
      } while (!userInput.equalsIgnoreCase("Q"));
   }
}