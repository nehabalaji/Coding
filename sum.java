package loops;
import java.util.Scanner;
public class sum {
	public int s1(int a, int b) {
		return a+b;
	}
	public int s2(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		int x, y, z, i;
		Scanner sc=new Scanner(System.in);
		sum s=new sum();
		System.out.println("the options are:\n"+"1.sum of two numbers\n"+"2.sum of three numbers");
		do {
			System.out.println("enter your choice");
			i=sc.nextInt();
			switch(i){
			case 1: System.out.println("enter the two numbers");
			        x=sc.nextInt();
			        y=sc.nextInt();
			        System.out.println("sum:\t"+s.s1(x, y));
			        break;
			case 2: System.out.println("enter three numbers");
			        x=sc.nextInt();
			        y=sc.nextInt();
			        z=sc.nextInt();
			        System.out.println("sum:\t"+s.s2(x, y, z));
			        break;
			default: System.out.println("Invalid choice");
               	    i=5;
               	    break;
               	     
			}
		}while(i!=0 && i<3);
			
		
	}

}
