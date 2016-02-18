import java.util.Scanner;

public class LCS {
	static Scanner scan = new Scanner (System.in);
	static String str1,str2,res;
	public static void main(String args[]){
		str1= scan.next();
		str2=  scan.next();
		res="";
		System.out.println(lcsLength(0, 0)+"  "+res);
	}
	
	public static int lcsLength(int i,int j){
		if(i==str1.length() || j== str2.length())
			return 0;
		else{
			if(str1.charAt(i)==str2.charAt(j)){
				//res+=str1.charAt(i);
				return 1+lcsLength(i+1, j+1);	
			}
			else return max(lcsLength(i+1, j),lcsLength(i, j+1));
			
		}
		
	}
	
	public static int max(int a, int b){
		if(a>=b)
			return a;
		else return b;
	}
	
}
