import java.util.Scanner;

public class Solution0010 {
    static Scanner scan = new Scanner(System.in);
    static int arr[];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t= scan.nextInt(),k;
        String str;
       int count;
        for(int i=0;i<t;i++){
            str = scan.next();
            count=0;
            if(str.length()%2!=0){
              System.out.println(-1);	
            } else {
            	 arr= new int[26];
            	 k=str.length()-1;
            	for(int j=0;j<str.length()/2;j++) {
            		arr[str.charAt(j)-97]++;
            		arr[str.charAt(k)-97]--;
            		k--;
            	}
                for(int j=0;j<arr.length;j++){
                	if(arr[j]<0)
                		count+=(arr[j]*-1);
                }
                System.out.println(count);
            }
        }
    }
}