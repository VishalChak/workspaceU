import java.util.Scanner;

public class palindrome {
	static Scanner scan = new Scanner(System.in);
	public static void  main(String args[]) {
		String str= scan.next();
		int l= str.length();
		int j=l-1;
		boolean b= true;
		for(int i=0;i<l/2;i++){
			if(str.charAt(i)!=str.charAt(j)){
				b=false;
				break;
			}
			j--;
		}
		if(b)
			System.out.println("palindrome");
		else System.out.println("Not");
	}
}
