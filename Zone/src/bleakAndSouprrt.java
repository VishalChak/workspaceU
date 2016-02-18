import java.util.Scanner;

public class bleakAndSouprrt {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int n= scan.nextInt();
		boolean b=false;
		for(int i= (int)(n-Math.ceil(Math.log(n)));i<n;i++){
			if(check(i, n)){
				b=true;
				break;
			}
		}
		if(b)
			System.out.println("Support");
		else System.out.println("Bleak");
	}
	
	public static boolean check(int n,int num){
		String str = Integer.toBinaryString(n);
		int count =0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1')
				count++;
		}
		if(n+count==num)
			return true;
		else return false;
	}
}
