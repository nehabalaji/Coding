import java.util.Scanner;
import java.util.Random;
public class data {
public static void main(String[] args) {
	Random random = new Random();
	String f = "fQ3DWOkk5I6tRsP?dqtU";
	int z=0;
	char l;
	Scanner sc=new Scanner(System.in);
	for(int i=0; i<f.length(); i++) {
		l = f.charAt(i);
		z += (int) l;
		
	}
	int number = random.nextInt(5 + 4) - 4;
	System.out.print(number);
	
}
}
 