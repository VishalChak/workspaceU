import java.util.Scanner;

public class Solution000 {

	static Scanner scan = new Scanner (System.in);
	static int arr[],frr[];
	public static void main(String args[]){
		int  n = scan.nextInt();
		frr = new int[26];
		String str;
		for(int i=0;i<n;i++){
			arr= new int [26];
			str = scan.next();
			for(int j=0;j<str.length();j++){
				arr[str.charAt(j)-97]++;
			}
			for(int j=0;j<arr.length;j++){
				if(arr[j]>0)
					frr[j]++;
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(frr[i]==n)
				count++;
		}
		System.out.println(count);
	}
}
