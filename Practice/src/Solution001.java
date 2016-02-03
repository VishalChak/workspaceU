import java.util.Scanner;

public class Solution001{
	static int arr[];
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		String str = scan.nextLine();
		str = str.toLowerCase();
		arr = new int [26];
		int ch;
		boolean b = true;
		for(int i= 0 ;i<str.length();i++){
			ch = str.charAt(i);
			if(ch>='a'  && ch<='z'){
				arr[ch-97]++;
			}
		}
		for(int i=0;i<arr.length;i++)
			if(arr[i]<=0){
				b=false;
				break;
			}
		if(b)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
	
}