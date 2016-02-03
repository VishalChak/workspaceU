import java.math.BigInteger;
import java.util.Scanner;

public class TestF {
	static Scanner scan = new Scanner(System.in);
	static BigInteger arr[];
	public static void main(String args[]){
		int a= scan.nextInt(),b,n;
		b= scan.nextInt();
		n=scan.nextInt();
		arr= new BigInteger [n];
		arr[0] = BigInteger.valueOf(a);
		arr[1] = BigInteger.valueOf(b);
		for(int i=2 ;i<n;i++){
			arr[i] = arr[i-1].pow(2).add(arr[i-2]);
		}
		System.out.println(arr[n-1]);
	}
}
