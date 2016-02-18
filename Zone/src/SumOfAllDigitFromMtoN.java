import java.util.Scanner;

public class SumOfAllDigitFromMtoN {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int m=scan.nextInt(),count=0;
		int n= scan.nextInt();
		for(int i=m;i<=n;i++){
			count+=digitSum(i);
		}
		System.out.println(count);
	}
	
	public static int digitSum(int n){
		int x=0;
		while(n>0){
			x+=n%10;
			n=n/10;
		}
		return x;
	}
}
