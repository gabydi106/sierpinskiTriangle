import java.util.*;
import java.awt.*;

public class Triangle{

	private ArrayList<Point2D> list = new ArrayList<Point2D>();
	
	public Triangle(Point2D p1, Point2D p2, Point2D p3){

		list.add(p1);
		list.add(p2);
		list.add(p3);

	}

	public Point2D getP1(){
		return list.get(0);
	}

	public Point2D getP2(){
		return list.get(1);
	}

	public Point2D getP3(){
		return list.get(2);
	}

	public void draw(Graphics g){

		Polygon p = new Polygon();	
		
		//1st get the ith element of the array list
		//then get the x or y coordinate of that element
		for(int i=0; i<3; i++){
			p.addPoint((int)list.get(i).getX(), (int) list.get(i).getY()) ;
		}
		
		g.fillPolygon(p);

	}
}