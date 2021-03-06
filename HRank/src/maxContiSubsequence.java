import java.util.Scanner;

public class maxContiSubsequence {
 static Scanner scan = new Scanner(System.in);
 static int arr[],m[];
 public static void main(String args[]){
	 int n=scan.nextInt();
	 arr= new int [n];
	 for(int i=0;i<n;i++)
		 arr[i]= scan.nextInt();
	 System.out.println(withDP() +"  "+withDP()+" "+alternativeDP());
}
 
 
 
 public static int withOutDP(){
	 int maxSum=0,curSum=0;
	 for(int i=0;i<arr.length;i++){
		 curSum+=arr[i];
		 if(curSum<0)
			 curSum=0;
		 if(maxSum<curSum)
			 maxSum=curSum;
	 } 
	 return maxSum;
 }
 public static int withDP(){
	 int n= arr.length;
	 m= new int[n];
	 if(arr[0]>0)
		 m[0]=arr[0];
	 else m[0]= 0;
	 for(int i=1;i<n;i++){
		 if(m[i-1]+arr[i]>0)
			 m[i]=m[i-1]+arr[i];
		 else m[i]=0;
	 }
	 int max=0;
	 for(int i=0;i<n;i++){
		 if(m[i]>max)
			 max=m[i];
	 }
	 return max;
 }
 
 public static int alternativeDP(){
	 int n= arr.length;
	 m=new int[n+1];
	 m[0]=arr[0];
	 m[1] = (arr[0]>arr[1]?arr[0]:arr[1]);
	 for(int i=2;i<n;i++){
		 m[i]=(m[i-1]>m[i-2]+arr[i]?m[i-1]:m[i-2]+arr[i]);
	 }
	 return m[n-1];
 }
 
 
}
