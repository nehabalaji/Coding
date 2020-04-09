import java.util.Scanner;

public class swap {
	public void display(int x, int y) {
		System.out.println("after swapping:\n"+x+"\t"+y);
	}

	public static void main(String[] args) {
		int a=10, b=20, temp;
		
		Scanner sc=new Scanner(System.in);
		swap s= new swap();
		
		temp=a;
		a=b;
		b=temp;
		
		s.display(a, b);
		
	}
}
