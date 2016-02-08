import java.util.Scanner;
import java.util.Stack;

public class permutation {
	static Stack<String> stk;
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		String str =scan.next();
		stk = new Stack<>();
		per("", str);
		while(!stk.isEmpty()){
			System.out.println(stk.pop());
		}
		
	}
	
	public static void  per(String prefix, String str) {
		int n= str.length();
		if(n==0)
			stk.push(prefix);
		else {
			for(int i=0;i<n;i++)
			per(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
		}
	}
}
