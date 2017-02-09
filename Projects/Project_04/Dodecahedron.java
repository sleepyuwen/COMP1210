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
   }
   public double getEdge() {
      return edge;
   }
   public double setEdge(double edgeIn) {
      if(edge > 0) {
         edge = edgeIn;
         return true;
      } else {
         return false;
      }
   }
}