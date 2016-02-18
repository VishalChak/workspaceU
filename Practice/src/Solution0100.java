import java.util.Scanner;

public class Solution0100 {
	static Scanner scan = new Scanner(System.in);
	static int arr [];
	static int brr []; 
	public static void main (String args[]) {
		String str = scan.next();
		String ttr = scan.next(),res="", ans="";
		arr = new int[26];
		brr= new int[26];
		for(int i=0;i<str.length();i++)
			arr[str.charAt(i)-65]++;
		for(int i=0;i<ttr.length();i++)
			brr[ttr.charAt(i)-65]++;
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)-65]>=1 && brr[str.charAt(i)-65]>=1  && (res.equals("") || res.charAt(res.length()-1) <= str.charAt(i)) ){
				res+=str.charAt(i);
				arr[i]--;
				brr[i]--;
			}
		}
		int crr [] =new int[res.length()];
		for(int i=0;i<res.length();i++){
			crr[i]= ttr.indexOf(res.charAt(i));
		}
		for(int i=0;i<res.length();i++){
			System.out.println(crr[i]);
		}
	}
}
