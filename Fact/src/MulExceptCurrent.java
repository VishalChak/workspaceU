import java.util.Scanner;

public class MulExceptCurrent {
	static Scanner scan = new Scanner(System.in);
	static int arr[],pro[];
	public static void main(String args[]){
		int n = scan.nextInt(),x=1,y=1;
		arr= new int[n];
		pro= new int[n];
		for(int i=0;i<n;i++)
			arr[i]= scan.nextInt();
		x= arr[0];
		pro[0]=1;
		for(int i=1;i<n;i++){
			pro[i]=x;
			x*=arr[i];
		}
		x=1;
		for(int i=n-1;i>=0;i--){
			pro[i]*=x;
			x*=arr[i];
		}
		for(int i=0;i<n;i++)
			System.out.print(pro[i]+" ");
	}
}
