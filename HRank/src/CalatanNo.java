import java.util.Scanner;

public class CalatanNo {
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	public static void main(String args[]){
		
		int n=scan.nextInt();
		arr= new int[n+1];
		System.out.print(directEquation(n)+" "+withOutDP(n)+" "+withDP(n));
		
	}
	
	
// T(n) = O(n^2)
	public static int withDP(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		arr[n]=0;
		for(int i=1;i<=n;i++){
			arr[n]+=withDP(i-1)*withDP(n-i);
		}
		return arr[n];
	}
	
//	 T(n) =  O(4^n)
	public static int withOutDP(int n){
		if(n==0) return 1;
		int count=0;
		for(int i=1;i<=n;i++){
			count+=withOutDP(i-1)*withOutDP(n-i);
		}
		return count;
	}
	
	
//	T(n) = O(n)
	public static int directEquation(int n){
		int ans=1,x=1,j=n;
		for(int i=2*n;i>n;i--){
			ans*=i;
			x*=j;
			j--;
		}
		
		return ans/((n+1)*x);
	}
}
