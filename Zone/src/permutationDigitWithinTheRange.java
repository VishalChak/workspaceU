import java.util.Scanner;

public class permutationDigitWithinTheRange {
	static Scanner scan;
	public static void main(String args[]){
		scan = new Scanner(System.in);
		int x= scan.nextInt(),count=0;
		int y= scan.nextInt();
		for(int i=x;i<=y;i++){
			if(permu(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
	public static boolean permu(int x){
		String str =Integer.toString(x);
		int j=str.length()-1;
		for(int i=0;i<str.length()/2;i++){
			if (str.charAt(i)!=str.charAt(j))
				return false;
			j--;
		}
		return true;
	}
}

