package loops;
import java.util.Scanner;
public class square {
	public int answer(int a, int b) {
		int c;
		c=(a+b)*(a+b);
		return c;
	}
	public static void main(String[] args) {
		int x, y;
		Scanner sc=new Scanner(System.in);
		square s=new square();
		do {
		System.out.println("enter the two numbers\n");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println(s.answer(x, y));
	}while(x>=0 && y>=0);

}
}
