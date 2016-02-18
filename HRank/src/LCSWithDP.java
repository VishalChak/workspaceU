import java.util.Scanner;

public class LCSWithDP {
	static int arr[][];
	static String str1,str2;
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		str1= scan.next();
		str2= scan.next();
		int m =str2.length();
		int n= str1.length();
		arr= new int [str2.length()+1][str1.length()+1];
		System.out.println(lcsLength(m, n));
	}
	
	public static int lcsLength(int m,int n){
		for(int i=m-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				//arr[i][j]= arr[i+1][j+1];
				if(str1.charAt(j)==str2.charAt(i))
					arr[i][j]++;
				if(arr[i][j+1]>arr[i][j])
					arr[i][j]=arr[i][j+1];
				if(arr[i+1][j]>arr[i][j])
					arr[i][j]=arr[i+1][j];
			}
		}
		return arr[0][0];
	}
}
