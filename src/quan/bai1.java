package quan;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		System.out.print("The Average value is: " + average(x,y,z) + "\n");
		
	}
	
	public static double average(double x, double y, double z)
	{
		return (x + y + z) / 3;
	}

}
