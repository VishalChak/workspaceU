import java.util.Scanner;

public class TestMax {
	static Scanner scan = new Scanner(System.in);
	static int arr[];
	public static void main(String args[]){
		int t= scan.nextInt(),n;
		int maxSum,currSum, nonCounti;
		for(int i=0;i<t;i++){
			n = scan.nextInt();
			maxSum=0;
			currSum=0;
			nonCounti=0;
			arr = new int [n];
			for(int j=0;j<n;j++)
				arr[j]=scan.nextInt();
			for(int j=0;j<n;j++){
				currSum =currSum+arr[j];
				if(currSum<0)
					currSum=0;
				if(maxSum<currSum)
					maxSum = currSum;
				if(arr[j]>0)
					nonCounti +=arr[j];
			}
			System.out.println(maxSum +" "+nonCounti);
		}
	}
}
