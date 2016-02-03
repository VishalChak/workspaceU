import java.util.Scanner;

public class Solution111 {
	static Scanner  scan = new Scanner(System.in);
	static int arr[],brr[];
	public static void main(String args[]) {
		String str = scan.next();
		String ttr= scan.next();
		int count = 0;
		arr= new int[26];
		brr = new int [26];
			for(int i=0;i<str.length();i++){
				arr[str.charAt(i)-97]++;
			}
			for(int i=0;i<ttr.length();i++){
				brr[ttr.charAt(i)-97]++;
			}
			for(int i=0;i<arr.length;i++){
				if(arr[i]!=brr[i])
				count+=Math.abs(arr[i]-brr[i]);
			}
		System.out.println(count);
		
	}
}
