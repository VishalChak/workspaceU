import java.util.Scanner;

public class toh {
	static Scanner scan = new Scanner(System.in);
	public static void main (String args[]) {
		int n= scan.nextInt();
		toh1(n,'A','B','C');
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
	
	public static void toh1(int n,char start,char mid,char end){
		if(n==1)
			System.out.println(start+"->"+end);
		else {
			toh1(n-1,start,end,mid);
			System.out.println(start+"->"+end);
			toh1(n-1,mid,start,end);
		}
	}
}
