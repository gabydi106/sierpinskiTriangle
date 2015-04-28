import java.awt.*;
public class Q2 {
  public static void main(String [] args) {
    int SIZE=512;
    // initialize drawing panel
    DrawingPanel p = new DrawingPanel(SIZE, SIZE);
    p.setBackground(Color.CYAN);
    Graphics g = p.getGraphics();
    int triangleHeight = (int) Math.round(SIZE * Math.sqrt(3.0) / 2.0);
    Point2D p1 = new Point2D(0, triangleHeight);
    Point2D p2 = new Point2D(SIZE / 2, 0);
    Point2D p3 = new Point2D(SIZE, triangleHeight);
    Triangle T=new Triangle(p1,p2,p3);
    g.setColor(Color.RED);
    T.draw(g);
  }
}
