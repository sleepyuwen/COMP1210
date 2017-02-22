import java.util.ArrayList;
/**
*/
public class DodecahedronList {
   private String label = "";
   ArrayList<DodecahedronObjects> dodObjList = new ArrayList<DodecahedronObjects>();
   
   public DodecahedronList(ArrayList<Dodecahedron>) {
      
   }
   
   public void getName() {
      return label;
   }
   
   public int numberOfDodecahedrons() {
      if (dodobjList.size() != 0) {
         return dodobjList.size();
      } else {
         return 0;
      }
   }
   
   public double totalSurfaceArea() {
      int index = 0;
      if (dodobjList.size() != 0) {
         while (index < dodobjList.size()) {
            Dodecahedron.surfaceArea(dodobjList.get(index));
            index++;
         } 
      } else {
         return 0;
      } 
   }
}