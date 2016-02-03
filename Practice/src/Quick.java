import java.util.Arrays;
import java.util.Scanner;

public class Quick {
	static Scanner scan =new Scanner(System.in);
	static int arr[];
	
	public static int partition(int l,int r){
		int i=l,j=r,temp,p;
		p=arr[l];
		while(i<j){
			while (arr[i]<=p && i<arr.length-1)
				i++;
			while(j>0)
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
	
	public static void qsort(int l,int r){
		if(l<r){
			int m = partition(l, r);
			qsort(l, m-1);
			qsort(m+1, r);
		}
	} 
	
	public static void main(String args[]){
		int n= scan.nextInt();
		arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]= scan.nextInt();
		//Arrays.sort(arr);
		qsort(0, n-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
