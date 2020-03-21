package coding;
import java.util.Scanner;
// to find the area of the parallelogram
public class Initializer_block {
	public static void main(String[] args) {
		int breadth, height, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the breadth and height of the parallelogram: ");
		breadth = sc.nextInt();
		height = sc.nextInt();
		if(breadth>=-100 && breadth<=100) {
			if(height>=-100 && height<=100) {
				area = breadth * height;
				System.out.println("The area of the parallelogram is "+area);
			}
		}
		else
			System.out.println("both breadth and height must be positive");
		
		
		
	}
}
