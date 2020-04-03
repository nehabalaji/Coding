import java.util.Scanner;

public class power {
	
	public int square(int a){
		return a*a;
	}
	
	public int cube(int a) {
		return a*a*a;
	}
	
	public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner(System.in);
		power p= new power();
		x=sc.nextInt();
		
		System.out.println(p.square(x));
		System.out.println(p.cube(x));
		
	}

}
