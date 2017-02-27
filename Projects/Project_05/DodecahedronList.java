import java.util.ArrayList;
/**
*/
public class DodecahedronList {
   private String label;
   ArrayList<Dodecahedron> dodObjList;
   
   public DodecahedronList(String labelIn, ArrayList<Dodecahedron> dodObjIn) {
      label = labelIn;
      dodObjList = dodObjIn;
   }
   
   public String getName() {
      return label;
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
      return ;
   }
}