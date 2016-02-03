import java.util.Scanner;

public class Solution010 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int t= scan.nextInt();

		for(int k=0;k<t;k++){
			String str= scan.next();
			int j=str.length()-2;
			boolean b=true;
			for(int i=0;i<str.length()-1;i++){
				if(Math.abs(str.charAt(i+1)-str.charAt(i))!= Math.abs(str.charAt(j)-str.charAt(j+1))){
					b=false;
					break;
				} else {
					j--;
				}
			}
			if(b)
				System.out.println("Funny");
			else System.out.println("Not Funny");
		}
	}
	
  public static void  name() {

}
}
