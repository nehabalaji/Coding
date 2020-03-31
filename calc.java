import java.util.Scanner;

public class calc{
	public int add(int a, int b) {
	return a+b;
	}
	
	public int subtract(int c, int d) {
	return c-d;
	}
	
	public int product(int e, int f) {
	return e*f;
	}
	
	public float divide(float g, float h) {
	return g/h;
	}
	
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		calc b = new calc();
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println(b.add(x,y));
		System.out.println(b.subtract(x,y));
		System.out.println(b.product(x,y));
		System.out.println(b.divide(x,y));
		
	}
	
	
}