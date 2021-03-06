import java.util.Scanner;

public class PairsFromTwoArr {
	static int x[],y[];
	static Scanner scan = new Scanner (System.in);
	public static void main(String args[]){
		int n=scan.nextInt();
		x=new int[n];
		for(int i=0;i<n;i++)
			x[i]= scan.nextInt();
		n=scan.nextInt();
		y=new int[n];
		for(int i=0;i<n;i++)
			y[i]= scan.nextInt();
		qsort(0, y.length-1);
		
	}
	
	public static void qsort(int i,int j){
		if(i<j){
			int m =partition(i,j);
			qsort(i,m-1);
			qsort(m+1, j);
		}
	}
	
	public static int partition(int l,int r){
		int i=l,j=r,p=y[l],temp;
		while(i<j){
			while(y[i]<=p && i<j)
				i++;
			while(y[j]>p)
				j--;
			if(i<j){
				temp=y[i];
				y[i]=y[j];
				y[j]=temp;
			}
		}
		y[l]=y[j];
		y[j]=p;
		return j;
	}
}
