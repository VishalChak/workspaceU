import java.util.Scanner;

public class toh {
	static Scanner scan = new Scanner(System.in);
	public static void main (String args[]) {
		int n= scan.nextInt();
		toh(n,'A','B','C');
	}
	
	public static void toh(int n,char start,char mid,char end) {
		if(n==1)
			System.out.println(start +" -> "+ end);
		else{
			toh(n-1,start,end,mid);
			System.out.println(start +" -> "+ end);
			toh(n-1,mid,start,end);
		}
	}
}
