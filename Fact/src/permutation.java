import java.util.Scanner;

public class permutation {
	static Scanner scan = new Scanner(System.in);
	static String str;
	public static void main(String args[]){
		str=scan.next();
		permu("", str);
		
	}
	
	public static void permu(String pre,String str){
		int n= str.length();
		if(n==0)
			System.out.println(pre);
		else {
			for(int i=0;i<n;i++){
				permu(pre+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
			}
		}
	}
	
	
	
}