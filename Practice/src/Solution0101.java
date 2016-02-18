import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution0101 {
	static Scanner scan = new Scanner(System.in);
	static String arr[];
	static int count;
	public static void main(String args[]){
		String str,res;
		int t = scan.nextInt(),k;
		for(int i=0;i<t;i++){
			str = scan.next();
			k= scan.nextInt();
			arr= new String [lenght(str.length())];
			count=0;
			subString(str, 0, 1);
			Arrays.sort(arr);
			res="";
			for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]+" ");
				res=res+arr[j];
			}
			System.out.println(res);
		}
	}
	
	public static void print(int position ,int k){
		if(position+arr[count].length()>=k){
			
		} else print(position+arr.length, k);
	}
	
	public static void subString(String str,int i,int j){
		
		if(i<str.length()){
			arr[count++]=str.substring(i,j);
			if(j==str.length()){
				i++;
				j=i+1;
			} else {
				j++;
			}
			subString(str, i, j);
		}
	}
	
	public static int lenght (int n){
		if (n==0)
			return 0;
		else if(n==1)
			return 1;
		else return n +lenght(n-1);
	}
}
