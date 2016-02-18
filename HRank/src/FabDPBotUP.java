import java.util.Scanner;

public class FabDPBotUP {
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	public static void main(String args[]){
		int n = scan.nextInt();
		arr= new int [n];
		System.out.println(fib(n));
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static int fib(int n){
		if(n==1) return arr[0]=0;
		else if(n==2) return arr[1]=1;
		else if(arr[n-1]!=0) return arr[n-1];
		else return arr[n-1] = fib(n-1)+fib(n-2);
	}
}