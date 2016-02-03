import java.util.Scanner;

public class Solution0011 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int t= scan.nextInt(),count,k;
		String str;
		for(int i=0;i<t;i++){
			count=0;
			str= scan.next();
			k = str.length()-1;
			for(int j = 0;j<str.length()/2;j++){
				if(str.charAt(j)!=str.charAt(k)){
					count+=Math.abs(str.charAt(j)-str.charAt(k));
				}
				k--;
			}
			System.out.println(count);
		}
	}
}
