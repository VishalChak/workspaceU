import java.util.Scanner;

public class XNoR {
	static int arr[ ];
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int n =scan.nextInt(),t=0;
		arr =new int[n];
		for(int i=0;i<n;i++)
			t= (t^i);
		System.out.println(t);

	}
}
