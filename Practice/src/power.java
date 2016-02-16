import java.util.Scanner;

public class power {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println((n&-n)==n);
	}
}
