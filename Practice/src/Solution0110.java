import java.util.Arrays;
import java.util.Scanner;

public class Solution0110 {
    static Scanner scan = new Scanner (System.in);
    static char arr[];
    public static void main(String[] args) {
        int t = scan.nextInt();
        String str,str1;
        int ch=-1,pos=-1;
        for(int i=0;i<t;i++){
            str = scan.next();
            for(int j =str.length()-2;j>=0;j--){
                if(str.charAt(j)<str.charAt(j+1)){
                    ch = str.charAt(j);
                    pos=j;
                    break;
                }
            }
            if(pos!=-1){
            	str1= str.substring(pos);
            	arr= str1.toCharArray();
            	Arrays.sort(arr);
            	for(int j=0;j<arr.length;j++){
            		if(arr[j]>(char)ch){
            			
            		}
            	}
            }
            
        }
        
    }
}