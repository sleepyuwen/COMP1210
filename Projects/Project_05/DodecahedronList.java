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
   // math is wrong needs to be fixed!
   public double averageSurfaceAreatoVolumeRatio() {
      double total = 0;
      int index = 0;
      while (index < dodObjList.size()) {
         total += dodObjList.get(index).surfaceToVolumeRatio()/dodObjList.size();
         index++;
      }
      return total;
   }
   
   public String toString() {
      String finalString = "";
      int index = 0;
      while (index < dodObjList.size()) {
         finalString = "\n" + dodObjList.toString() + "\n";
         index++;
      }
      return "\n" + listName + "\n" + finalString;
   }
   
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      return "----- Summary for " + listName + " -----\n" +
            "Number of Dodecahedrons: " + dodObjList.size() + "\n" +
            "Total Surface Area: " + fmt.format(totalSurfaceArea()) + "\n" +
            "Total Volume: " + fmt.format(totalVolume()) + "\n" +
            "Average Surface Area: " + fmt.format(averageSurfaceArea()) + "\n" +
            "Average Volume: " + fmt.format(averageVolume()) + "\n" + 
            "Average Surface/Volume Ratio: " + fmt.format(averageSurfaceAreatoVolumeRatio());
   }
}