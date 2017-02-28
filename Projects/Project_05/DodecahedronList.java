import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*/
public class DodecahedronList {
   private String listName;
   ArrayList<Dodecahedron> dodObjList;
   
   public DodecahedronList(String listNameIn, ArrayList<Dodecahedron> dodObjListIn) {
      listName = listNameIn;
      dodObjList = dodObjListIn;
   }
   
   public String getName() {
      return listName;
   }
   
   public int numberOfDodecahedrons() {
      return dodObjList.size();
   }
   
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += dodObjList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += dodObjList.get(index).volume();
         index++;
      }
      return total;
   }
   
   public double averageSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += (dodObjList.get(index).surfaceArea())/dodObjList.size();
         index++;
      }
      return total;
   }
   
   public double averageVolume() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += (dodObjList.get(index).volume())/dodObjList.size();
         index++;
      }
      return total;
   }
   
   public double averageSurfaceAreatoVolumeRatio() {
      return averageSurfaceArea()/averageVolume();
   }
   
   public String toString() {
      String finalString = "";
      int index = 0;
      while (index < dodObjList.size()) {
         finalString = dodObjList.toString();
         index++;
      }
      return listName + "\n\n" + finalString + "\n";
   }
   // prints the number of Dodecahedrons, total surface area, total volume, average surface area, 
   // average volume, and average surface to volume ratio
   public String summaryInfo() {
      return "----- Summary for " + listName + " -----\n" +
            "Number of Dodecahedrons: " + dodObjList.size() + "\n" +
            "Total Surface Area: " + totalSurfaceArea() + "\n" +
            "Total Volume: " + totalVolume() + "\n" +
            "Average Surface Area: " + averageSurfaceArea() + "\n" +
            "Average Volume: " + averageVolume() + "\n" + 
            "Average Surface/Volume Ratio: " + averageSurfaceAreatoVolumeRatio();
   }
}