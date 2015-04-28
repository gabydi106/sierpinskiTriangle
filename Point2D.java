import java.awt.*;

public class Point2D{
	private double x;
	private double y;

	public Point2D(double x, double y){
		this.x=x;
		this.y=y;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public Point2D midpoint (Point2D b) {

		//averaging the x and y values of the object called upon
		double x2 = (this.x+b.x)/2;
		double y2 = (this.y+b.y)/2;

		//create a new point named 'midpoint' with an x and y coordinate 
		Point2D midpoint = new Point2D(x2,y2);

		//return the point
		return midpoint;
	}

	public void draw(Graphics g, int radius) {
		//take as parameter a Graphics variable g and the radius of the point. It should then, 
		//using the library method below, draw and oval centered at the Point2D coordinate with 
		//height and width of radius. To do this, you can use the method from the Graphics class:

		//note: need to cast this.x and this.y into (int)


		g.fillOval((int) this.x, (int) this.y, radius, radius);

	}
}