import java.util.Scanner;

public class Qsort {
	static Scanner scan = new Scanner (System.in);
	static int arr[];
	public static void main(String args[]){
		int n =scan.nextInt();
		arr= new int [n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		sort(0, n-1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	
	
	public static void sort(int i,int j){
		if(i<j){
			int m = partition(i,j);
			sort(i,m-1);
			sort(m+1,j);
		}
	}
	
	public static int partition(int l,int r) {
		int i=l,j=r,p=arr[l],temp;
		while(i<j){
			while(arr[i]<=p && i<j)
				i++;
			while(arr[j]>p)
				j--;
			if(i<j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		arr[l]=arr[j];
		arr[j]=p;
		return j;
	}
}
