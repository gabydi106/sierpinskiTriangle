import java.awt.*;
public class Q3 {

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
    g.setColor(Color.MAGENTA);
    //CHANGE THE FOLLOWING LEVEL IF YOU WANT TO TEST
    //ON A DIFFERENT DEPTH
    int level = 6;
    drawSierpinski(level,g,T);
  }

  public static void drawSierpinski(int level, Graphics g, Triangle t) {

 	//YOUR CODE GOES HERE!
    //if level = 1, use Q2 then exit method

    if(level==1){
      t.draw(g);
    }

    
    //if level > 1, calculate midpoints (3), construct new triangles (3), 
    //call drawSierpinski method for each triangle, level-1 (3 times total) 
    //THIS ALL GOES INSIDE THE ELSE

    else {

      Point2D m1 = t.getP1().midpoint(t.getP2());
      Point2D m2 = t.getP2().midpoint(t.getP3());
      Point2D m3 = t.getP3().midpoint(t.getP1());
    
      Triangle t1 = new Triangle(t.getP1(), m1, m3);
      Triangle t2 = new Triangle(m1, t.getP2(), m2);
      Triangle t3 = new Triangle(m3, m2, t.getP3());

      drawSierpinski(level-1, g, t1);
      drawSierpinski(level-1, g, t2);
      drawSierpinski(level-1, g, t3);
    }
  }
}
