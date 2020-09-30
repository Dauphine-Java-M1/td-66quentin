package fr.dauphine.ja.guardiaquentin.shapes;

import java.util.LinkedList;

public class LigneBrisee {
	//private ArrayList<Point> Ligne;
	private LinkedList<Point> Ligne;
	/*private int maxPoint;
	private static int NombrePts=0;*/
	
	LigneBrisee(int n){
		this.Ligne=new LinkedList<>();
		/*this.maxPoint=n;
		 this.Ligne= = new ArrayList<>();*/
	}
	
	public void add(Point p) {
		if(p!=null)
			Ligne.add(p);
		else
			System.out.println("Pas de point nul");
	}
	
	public boolean contains(Point p) {
		for (Point p2 : Ligne) {
		    if(p.isSameAs(p2))
		    	return true;
		}
		return false;
	}
	
	/*public int pointCapacity() {
		return maxPoint;
	}
	
	public int nbPoints() {
		return NombrePts;
	}
	public void add(Point p) {
		Ligne.add(p);
		if(pointCapacity()>nbPoints()) {
			Ligne.add(p);
			NombrePts++;
		}
	}*/

}
