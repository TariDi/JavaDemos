import java.util.*;

public class CreateObjectDemo{
	public static void main(String args[]){
		Point origin_one= new Point(23,94);
		Rectangle rect_one= new Rectangle(origin_one,100,200);
		Rectangle rect_two= new Rectangle(50,100);

		//display rect_one's width, height and area
		System.out.println("width of rect_one: "+rect_one.width);
		System.out.println("Height of rect_one: "+rect_one.height);
		System.out.println("Area of rect_one: "+rect_one.area());

		//set origin of rect_two as origin_one
		rect_two.move(origin_one.x,origin_one.y);
		System.out.println("X position of rect_two: "+rect_two.origin.x);
		System.out.println("Y position of rect_two: "+rect_two.origin.y); 

		//set origin of rect_two as 49,30
		rect_two.move(49,30);
		System.out.println("X position of rect_two: "+rect_two.origin.x);
		System.out.println("Y position of rect_two: "+rect_two.origin.y); 

	}
}

/*public class Point{
	public int x;
	public int y;

	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class Rectangle{
	public int width;
	public int height;
	public Point origin;

	public Rectangle(){
		origin= new Point(0,0);
	}

	public Rectangle(Point p){
		origin=p;
	}

	public Rectangle(int w,int h){
		this(new Point(0,0),w,h);
	}
	
	public Rectangle(Point p,int w,int h){
		origin=p;
		width=w;
		height=h;
	}

	public void move(int x,int y){
		origin.x=x;
		origin.y=y;
	}

	public int area(){
		return width*height;
	}
}*/
