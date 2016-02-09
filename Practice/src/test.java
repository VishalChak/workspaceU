import java.util.Scanner;
//
public class test {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		String str= scan.next();
		permutation("", str);
	}
	
	
	public static void permutation(String prefix,String str){
		int n= str.length();
		if(n==0)
			System.out.println(prefix);
		else for(int i=0;i<n;i++){
			permutation(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
		}
	}
	
}
