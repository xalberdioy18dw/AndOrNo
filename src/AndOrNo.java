import java.util.Scanner;
public class AndOrNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		boolean z = false;
		while (!z) {
			int num = sc.nextInt();
			if (num == 0) {
				z = true;
				System.out.println("You entered the correct number");
			}
		}
		}
		
	}
