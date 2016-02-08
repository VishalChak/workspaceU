import java.util.ArrayList;
import java.util.Scanner;

public class nextHighPalindrome {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Integer> arr;
	static int arr1 [];
	public static void main(String args[]) {
		int x= scan.nextInt();
		add(x);
		System.out.println(arr);
		
			
	}
	
	public static void add (int x) {
		if(x!=0){
			add(x/10);
			arr.add(x%10);
		}
	}
}
