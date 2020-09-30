package fr.dauphine.ja.guardiaquentin.shapes;

import java.util.ArrayList;

public class Point 
{
	private int x;
	private int y;
	private static int nbPoints=0;
	Point() {
		this.x=0;
		this.y=0;
		Point.nbPoints++;
	}
	Point(int x, int y) {
		this.x=x;
		this.y=y;
		Point.nbPoints++;
	}
	Point(int xy) {
		this.x=xy;
		this.y=xy;
		Point.nbPoints++;
	}
	
    public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "("+x+','+y+")";
	}
	
	public boolean isSameAs(Point p) {
		return x==p.x && y==p.y;
	}
	
    public static void main( String[] args )
    {
    	//Tests Point.java
    	/*Point p1=new Point(1,2);
    	Point p2=p1;
    	Point p3=new Point(1,2);
    	
    	System.out.println(p1);
    	System.out.println(p1.isSameAs(p2));
    	
    	ArrayList<Point> list = new ArrayList<>();
    	list.add(p1);
    	System.out.println(list.indexOf(p3));*/
    	
    	//Test LigneBrisee
    	LigneBrisee l1=new LigneBrisee(3);
    	Point p1=new Point(1,2);
    	l1.add(p1);
    	System.out.println(l1.contains(p1));
    }
}
