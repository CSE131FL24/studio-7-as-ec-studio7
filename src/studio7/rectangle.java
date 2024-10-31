package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private boolean square;
	
	public rectangle(double initiallength, double initialwidth)
	{
		length = initiallength;
		width = initialwidth;
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5, 0.5, width, length);
		area = initiallength*initialwidth;
		perimeter = (2*initiallength)+(2*initialwidth);
		if (width==length) {
			square = true;
		}
	}
	
	public String toString() {
		String result = ("this is the area: " + area);
		result += ("This is the perimeter: " + perimeter);
		result += ("Is this a square? " + square);
		return result;
		
	}
	
	public double getarea()
	{
		return area;
	}
	
	public static void main(String[] args)
	{
		rectangle r1 = new rectangle(0.1, 0.2);
		System.out.println(r1);
		rectangle r2 = new rectangle(0.1, 0.1);
		System.out.println(r2);
		
		if ((r2.getarea()) > (r1.getarea())) {
			System.out.println("The second rectangle has a larger area");
			
		}
		else if ((r2.getarea()) == (r1.getarea())) {
			System.out.println("The rectangles have an equal area");
		}
		else {
			System.out.println("The first rectangle has a larger area");
		}
		
		
	}
}
