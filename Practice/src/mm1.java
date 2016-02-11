import java.util.Scanner;

public class mm1 {
	static int first[][];
	static int second[][],res[][];
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int m=scan.nextInt();
		int n= scan.nextInt();
		first = new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				first[i][j]=scan.nextInt();
		System.out.println("Enter Second Row and Colom");
		int p=scan.nextInt();
		int q= scan.nextInt();
		if(n!=p)
			System.out.println("Not Possible");
		else {
			int sum;
			second = new int[p][q];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					second[i][j]=scan.nextInt();
			res= new int[m][q];
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++){
					sum=0;
					for(int k=0;k<n;k++){
						sum+=first[i][k]*second[k][k];
					}
					res[i][j]=sum;
				}
			for(int c= 0;c<m;c++){
				for(int d= 0;d<n;d++)
					System.out.print(res[c][d]+" ");
				System.out.println();
			}
		}
	}
}
