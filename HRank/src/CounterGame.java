import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CounterGame {
	static Scanner scan = new Scanner (System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException{
		int t= scan.nextInt(),count;
		long n;
		String str;
		for(int i=0;i<t;i++){
			n=scan.nextLong();
			count=0;
			while(n>1){
				if((n&-n)==n){
					n=n/2;
				} else{
					str = Long.toBinaryString(n);
					n=n-(1<<str.length()-1);
					System.out.println((1<<str.length()-1));
					//break;
				}
				count++;
			}
//			if(count%2==0)
//				System.out.println("Richard");
//			else System.out.println("Louise");
		}
	}
}

