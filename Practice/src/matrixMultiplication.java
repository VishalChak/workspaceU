import java.util.Scanner;

public class matrixMultiplication {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("row col of first matrix");
		int m= scan.nextInt();
		int n= scan.nextInt();
		int first [][]= new int[m][n];
		System.out.println("enter the value of first matrix");
		for(int c= 0;c<m;c++){
			for(int d= 0;d<n;d++)
				first[c][d]=scan.nextInt();
		}
		System.out.println("row col of second matrix");
		int p= scan.nextInt();
		int q= scan.nextInt();
		int second [][];
		int result [][];
		int sum = 0;
		if(n!=p)
			System.out.println("Not possible withthis dimention");
		else {
			second= new int[p][q];
			System.out.println("enter the value of second matrix");
			for(int c= 0;c<m;c++){
				for(int d= 0;d<n;d++)
					second[c][d]=scan.nextInt();
			}
			result= new int[m][q];
			
			for(int c= 0;c<m;c++){
				for(int d= 0;d<n;d++){
					for(int k=0;k<p;k++)
						sum=sum+first[c][k] * second[k][d];
					result[c][d]=sum;
					sum=0;
				}
			}
			for(int c= 0;c<m;c++){
				for(int d= 0;d<n;d++)
					System.out.print(result[c][d]+" ");
				System.out.println();
			}
		}
	}
}
