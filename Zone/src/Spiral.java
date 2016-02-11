import java.util.Scanner;

public class Spiral {
	static int m,n,arr[][];
	static Scanner scan = new Scanner (System.in);
	public static void main(String args[]){
		m=scan.nextInt();
		n=scan.nextInt();
		arr= new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j] = scan.nextInt();
		spiral();
	}
	
	public static void spiral(){
		int k=0,l=0;
		while(k<m && l<n){
			for(int i=l;i<n;i++)
				System.out.print(arr[k][i]+" ");
			k++;
			for(int i=k;i<m;i++)
				System.out.print(arr[i][n-1]+" ");
			n--;
			if(k<m){
				for(int i=n-1;i>=l;i--)
					System.out.print(arr[m-1][i]+" ");
				m--;
			}
			if(l<n){
				for(int i=m-1;i>=k;i--)
					System.out.print(arr[i][l]+" ");
				l++;
			}
		}
	}
	
	
}
