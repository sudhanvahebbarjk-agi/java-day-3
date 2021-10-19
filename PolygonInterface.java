package training.two;
import java.util.*;
import java.math.*;

interface Polygon{
	void circle();
	void rectangle();
	void triangle();
	void square();
	void hexagon();
}

class PolygonInterface implements Polygon {
	
	Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolygonInterface pi=new PolygonInterface();
		pi.circle();
		pi.rectangle();
		pi.triangle();
		pi.square();
		pi.hexagon();

	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter circle radius");
		int radius=scanner.nextInt();
		
		System.out.println("Area of circle:"+Math.PI*radius*radius);
		
	}

	@Override
	public void rectangle() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter rectangle length");
		int length=scanner.nextInt();
		
		System.out.println("Enter rectangle breadth");
		int breadth=scanner.nextInt();
		
		System.out.println("Area of rectangle:"+length*breadth);
		
		
	}

	@Override
	public void triangle() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter triangle base");
		int b=scanner.nextInt();
		
		System.out.println("Enter triangle height");
		int h=scanner.nextInt();
		
		System.out.println("Area of triangle:"+0.5*b*h);
		
	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter side of square");
		int a=scanner.nextInt();
		
		System.out.println("Area of square:"+a*a);
		
	}

	@Override
	public void hexagon() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter side of heaxgon");
		int a=scanner.nextInt();
		
		System.out.println("Area of hexagon:"+(3*Math.sqrt(3)*a*a)/2);
		
	}

}
