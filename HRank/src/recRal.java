import java.util.Scanner;

//page no  401, Plm no 2


public class recRal {
	static Scanner scan = new Scanner (System.in);
	static int arr[];
	public static void main(String args[]){
		int n= scan.nextInt();
		arr= new int[n+1];
		relation(n);
		System.out.println(arr[n]);
	}
	
	public static void relation(int n){
		arr[0]=2;
		arr[1] =2;
		for(int i=2;i<=n;i++){
			for(int j=1;j<i;j++){
				arr[i]+= 2*arr[j]*arr[j-1];
			}
		}
	}
}
