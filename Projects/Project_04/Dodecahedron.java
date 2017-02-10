/**
*/
public class Dodecahedron {

   //fields
   private String label = "";
   private String color = "";
   private double edge = 0;

   // constuctor   
   public Dodecahedron(String labelIn, String colorIn, double edgeIn) {
      setlabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }

   //methods
   public String getLabel() {
      return label;
   }
   public String setlabel(String labelIn) {
      if(label != null) {
         label = labelIn.trim();
      } else {
         return label;
      }
      return label;
   }
   public String getColor() {
      return color;
   }
   public String setColor(String colorIn) {
      if(color != null) {
         color = colorIn.trim();
      } else {
         return color;
      }
      return color;
   }
   public double getEdge() {
      return edge;
   }
   public boolean setEdge(double edgeIn) {
      if(edge > 0) {
         edge = edgeIn;
         return true;
      } else {
         return false;
      }
   }
   public void surfaceArea() {
      double surfaceArea = 3 * Math.sqrt(25 + 10 * Math.sqrt(5)) * Math.pow(edge, 2);
   }
   public void volume() {
      double volume = ((15 + 7 * Math.sqrt(5)) / (4)) * Math.pow(edge, 3);
   }
   public void surfaceAreaToVolumeRatio() {
      double ratio = surfaceArea / volume;
   }
   public String toString() {
      
   }
}