package marks;

import java.util.Scanner;

public class stud {
	
	public int totalmarks(int a, int b, int c, int d, int e,int f) {
	
	return (a+b+c+d+e+f);
	}
	
	public float average(int a, int b, int c, int d, int e, int f) {
		float avg=(float)(a+b+c+d+e+f)/6;
		return avg;
	}
	public static void main(String[] args){
		int s1, s2, s3, s4, s5, s6;
		
		Scanner sc=new Scanner(System.in);
		stud b= new stud();
		
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		s6=sc.nextInt();
		
		int total = b.totalmarks(s1, s2, s3, s4, s5, s6);
		
		float avrg= b.average(s1, s2, s3, s4, s5, s6);
		
		System.out.println("total:\t"+total+"\n average:\t"+avrg);
	}

}
