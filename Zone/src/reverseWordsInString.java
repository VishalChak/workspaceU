import java.util.Scanner;

public class reverseWordsInString {
	static Scanner scan;
	public static void main(String args[]){
		scan = new Scanner(System.in);
		String str = scan.nextLine(),rev;
		int l=0,r;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				revPrint(str.substring(l,i));
				System.out.print(" ");
				l=i+1;
			} else if( i== str.length()-1){
				revPrint(str.substring(l));
			}
		}
	}
	
	public static void revPrint(String str){
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
	}
}
