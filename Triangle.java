//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;

	public Triangle(int a, int b, int c)
	{
  sideA = a;
  sideB = b;
  sideC = c;
	}

	public int getPerimeter( )
	{
    int perimeter = sideA+sideB+sideC;
    return perimeter;
	}

	public double getArea( )
	{
    double perimeter = getPerimeter( );
    perimeter /=2;
    double area = Math.sqrt(perimeter*(perimeter-sideA)*(perimeter-sideB)*(perimeter-sideC));
		return area;
	}
}