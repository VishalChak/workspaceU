import java.util.Scanner;

public class BinaryString {
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	public static void main(String args[]){
		int n= scan.nextInt();
		arr= new int[n];
		print(n);
	}
	
	
	public static void print(int n){
		if(n<1){
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]);
			System.out.println();
		} else { 
			arr[n-1]=0;
			print(n-1);
			arr[n-1]=1;
			print(n-1);
			
			
		}
	}
}
