import java.util.Scanner;

public class missing {
	static Scanner scan = new Scanner (System.in);
	static int arr[];
	public static void main(String args[]){
		int n= scan.nextInt(),res=0,ans=0;
		arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			
		}
		for(int i=0;i<n;i++){
			ans^=arr[i];
			res^=(i+1);
		}
			
		System.out.println(ans);
	}
}
