import java.util.Scanner;

public class APlusB {
	
	public static void main (String[] args) {
		String[] input;
		int A, B;
		System.out.println("Spacebar betweens each number");
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine().split(" ");
		A = Integer.parseInt(input[0]);
		B = Integer.parseInt(input[1]);
		
		System.out.println(A + B);
		}
}
