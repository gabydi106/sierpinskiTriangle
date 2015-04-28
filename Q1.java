import java.util.Random;
import java.awt.*;
public class Q1 {
  public static void main(String [] args) {
    int SIZE=512;
    // initialize drawing panel
    DrawingPanel p = new DrawingPanel(SIZE, SIZE);
    p.setBackground(Color.CYAN);
    Graphics g = p.getGraphics();
    Random randomGenerator = new Random();
    for (int i=0; i<1000; i++) {
      Point2D pnt=new Point2D(randomGenerator.nextDouble()*SIZE,SIZE*randomGenerator.nextDouble());      
      pnt.draw(g,(int)(randomGenerator.nextDouble()*10));
    }
  }
}