import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
/**
@author perry bunn
@version 2/27/17
*/
public class DodecahedronList {
   private String listName;
   private ArrayList<Dodecahedron> dodObjList;
   /**
   @param listNameIn input for the listName
   @param dodObjListIn input for the dodObjList
   */
   public DodecahedronList(String listNameIn, ArrayList<Dodecahedron> 
                                                      dodObjListIn) {
      listName = listNameIn;
      dodObjList = dodObjListIn;
   }
   /**
   @return returns the name of the list
   */
   public String getName() {
      return listName;
   }
   /**
   @return retuns the total number of objs in the array
   */
   public int numberOfDodecahedrons() {
      return dodObjList.size();
   }
   /**
   @return returns the total surface area
   */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += dodObjList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   /**
   @return returns the total volume
   */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += dodObjList.get(index).volume();
         index++;
      }
      return total;
   }
   /**
   @return returns the average surface area
   */
   public double averageSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += (dodObjList.get(index).surfaceArea()) / dodObjList.size();
         index++;
      }
      return total;
   }
   /**
   @return returns the average volume
   */
   public double averageVolume() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += (dodObjList.get(index).volume()) / dodObjList.size();
         index++;
      }
      return total;
   }
   /**
   @return return the average surfaec to volume ratio
   */
   public double averageSurfaceToVolumeRatio() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += dodObjList.get(index).surfaceToVolumeRatio() 
                                          / dodObjList.size();
         index++;
      }
      return total;
   }
   /**
   @return returns the obj atributes
   */
   public String toString() {
      String finalString = "";
      int index = 0;
      while (index < dodObjList.size()) {
         finalString = "\n" + dodObjList.toString() + "\n";
         index++;
      }
      return "\n" + listName + "\n" + finalString;
   }
   /**
   @return returns the summary of the array
   */
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + listName + " -----\n"
            + "Number of Dodecahedrons: " + dodObjList.size() + "\n"
            + "Total Surface Area: " + fmt.format(totalSurfaceArea()) + "\n"
            + "Total Volume: " + fmt.format(totalVolume()) + "\n"
            + "Average Surface Area: " + fmt.format(averageSurfaceArea()) + "\n"
            + "Average Volume: " + fmt.format(averageVolume()) + "\n" 
            + "Average Surface/Volume Ratio: "
            + fmt.format(averageSurfaceToVolumeRatio());
   }
   
   // Project 6 below
   
   public ArrayList getList() {
      return dodObjList;
   }
   
   public DodecahedronList readFile(String fileNameIn) throws IOException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Dodecahedron> dodObjList = new ArrayList<Dodecahedron>();
      String dodObjListName = "";
      String label = "";
      String color = "";
      double edge = 0;
      
      dodObjListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         
         Dodecahedron dodObj = new Dodecahedron(label, color, edge);
         dodObjList.add(dodObj);
      }
      
      DodecahedronList dodList = new DodecahedronList(dodObjListName, dodObjList);
      return dodList;
   }
   
   public void addDodecahedron(String labelIn, String colorIn, double edgeIn) {
      Dodecahedron dodObj = new Dodecahedron(labelIn, colorIn, edgeIn);
      dodObjList.add(dodObj);
   }
   
   public Dodecahedron findDodecahedron(String labelIn) {
      int index = -1;
      for (Dodecahedron dodObj : dodObjList) {
         if (dodObj.getLabel() == labelIn) {
            index = dodObjList.indexOf(dodObj);
            break;
         }
      }
      
      if (index >= 0) {
         return dodObjList.get(index);
      } else {
         return null;
      }
   }
   
   public Dodecahedron deleteDodecahedron(String labelIn) {
      int index = -1;
      for (Dodecahedron dodObj : dodObjList) {
         if (dodObj.getLabel() == labelIn) {
            index = dodObjList.indexOf(dodObj);
            break;
         }
      }
      
      if (index >= 0) {
         dodObjList.remove(index);
         return dodObjList.get(index);
      } else {
         return null;
      }
   }
   
   public boolean editDodecahedron(String labelIn, String colorIn, double edgeIn) {
      boolean result = false;
      for (Dodecahedron dodObj : dodObjList) {
         if (dodObj.getLabel() == labelIn) {
            dodObj.setColor(colorIn);
            dodObj.setEdge(edgeIn);
            result = true;
            break;
         }
      }
      return result;
   }
}