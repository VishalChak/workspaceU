import java.util.Scanner;

public class KthSumMatrix {
	static Scanner scan = new Scanner(System.in);
	static int arr[][],strip[][];
	public static void main(String args[]){
		int x= scan.nextInt();
		if((x & -x)==x)
			System.out.println("Yes");
		else System.out.println("No");
	}
}
