import java.util.ArrayList;
/**
*/
public class DodecahedronList {
   private String label;
   ArrayList<DodecahedronList> dodObjList;
   
   public DodecahedronList(String labelIn, ArrayList<DodecahedronList> dodObjIn) {
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
            // "try and separate the objects and then find the surfaceArea of that new object" - TA
            // wont compile as is
            total += dodObjList.get(index).surfaceArea();
            index++;
         }
       return total;
   }
}