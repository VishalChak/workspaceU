import java.util.Scanner;

public class Solution1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int n= scan.nextInt();
		String str = scan.next();
		int r= scan.nextInt();
		r= r%26;
		//char arr [] =str.toCharArray();
		int temp;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				temp = str.charAt(i)+r;
				if(temp>122)
					temp-=26;
				System.out.print((char)temp);
			} else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				temp = str.charAt(i)+r;
				if(temp>90)
					temp-=26;
				System.out.print((char)temp);
			} else 
				System.out.print(str.charAt(i));
		}
	}

}
