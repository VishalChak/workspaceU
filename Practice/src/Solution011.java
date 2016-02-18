import java.util.Scanner;

public class Solution011 {
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	public static void main(String args[]){
		String str = scan.nextLine();
		arr= new int [26];
		for(int i=0;i<str.length();i++){
			arr[str.charAt(i)-97]++;
		}
		int count= 0;
		boolean b=true;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				count++;
			if(count>=2){
				b=false;
				break;
			}
				
		}
		if(b)
			System.out.println("YES");
		else System.out.println("NO");
	}
}
