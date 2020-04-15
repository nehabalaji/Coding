import java.util.Scanner;
public class sample{
	int area;
	public sample(int a) {
		this.area=a*a;
	}
	public sample(int a, int b) {
		this.area=a*b;
	}
	public sample(int a, int b, int c) {
		this.area=a*b*c;
	}
	public sample(double a) {
		this.area=3.14*a*a;
	}
	
	public static void main(String[] args) {
		
		sample s=new sample(10);
		sample s1=new sample(10, 20);
		sample s2=new sample(10, 20, 30);
		sample s3=new sample(10.4);
		System.out.println("area of square:\t"+s.area);
		System.out.println("area of rectangle:\t"+s1.area);
		System.out.println("area of triangle:\t"+s2.area);
		System.out.println("area of circle:\t"+s3.area);
		
		
	}
}