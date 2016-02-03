import java.util.Scanner;

class NodeT{
	int data ,candy;
}


public class Solution00 {
	static NodeT arr[];
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int n = scan.nextInt();
		arr= new NodeT[n];
		NodeT temp;
		for(int i=0;i<n;i++){
			temp = new NodeT();
			temp.data=scan.nextInt();
			arr[i]=temp;
		}
			
		chech();
//		for(int i=0;i<n;i++)
//			System.out.print(arr[i].candy+" ");
	}
	
	
	public static void chech(){
		int temp;
		for(int i=0;i<arr.length;){
			temp = next(i);
			temp-=i;
			
			while(temp>=0 && i<arr.length){
				arr[i].candy=temp+1;
				temp--;
				i++;
			}
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i].candy+" ");
	}
	
	
	public static int next(int i){
		while(i<arr.length-1){
			if(arr[i].data>arr[i+1].data)
				i++;
			else return i;
		}
		return i+1;
	}
}
