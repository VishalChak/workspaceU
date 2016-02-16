import java.util.Scanner;

public class multiplication {
 public static void main(String args[]){
	 Scanner scan = new Scanner (System.in);
	 int x = scan.nextInt();
	 int y=scan.nextInt();
	 System.out.println(mul(x, y));
 }
 
 
 public static int mul(int x,int y){
	 if (y==0)
		 return 0;
	 else if(y>0)
		 return x+ mul(x,y-1);
	 else return -mul(x,-y);
 }
}
