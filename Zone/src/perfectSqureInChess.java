import java.util.Scanner;

public class perfectSqureInChess {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int sq=0;
		for(int i=0;i<8;i++){
			sq+=(i+1)*(i+1);
		}
		System.out.println(sq);
	}
}
