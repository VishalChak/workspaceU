import java.util.Scanner;

public class LonelyInteger {
	static Scanner scan = new Scanner (System.in);
	public static void main(String args[]){
	  int n= scan.nextInt(),res=0;
	  for(int i=0;i<n;i++){
		  res=res^scan.nextInt();
	  }
	  System.out.println(res);
	}
}
