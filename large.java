import java.util.Scanner;
public class large {
	
	public int compare(int a, int b) {
		if(a>b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		large l= new large();
		x=sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("largest number=\t"+l.compare(x, y));
	}

}
