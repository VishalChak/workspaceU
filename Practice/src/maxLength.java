import java.util.Scanner;

public class maxLength {
	static int arr[][],m,n;
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		m= scan.nextInt();
		n=scan.nextInt();
		arr = new int [m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println(check(0, 0));
	}
	
	public static int  check(int i,int j){
		if(i<m && j<n){
			if(arr[i][j]==1)
				return 1+max(check(i+1, j),check(i, j+1),check(i+1, j+1));
			else return 0;
		}
		return 0;
	}
	
	public static int max(int a,int b,int c){
		if(a>=b && a>=c)
			return a;
		else if(b>=a && b>=c)
			return b;
		else return c;
	}
}
