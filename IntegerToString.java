package coding;
import java.util.Scanner;
//Convert the given integer to string
public class IntegerToString {
	public static void main(String[] args) {
		int n;
		String s;
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		s = String.valueOf(n);
		System.out.println(s);
	}
}
