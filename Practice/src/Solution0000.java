import java.util.Scanner;

public class Solution0000 {
    
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        int t= scan.nextInt(),k;
        String prefix = "",str;
        for(int  i=0;i<t;i++){
            str= scan.next();
            System.out.println(palindrome1(str));
        }
    }
    public static int palindrome1(String str){
       int  k=str.length()-1;
        for(int j=0;j<str.length()/2;j++){
        	if(str.charAt(j)!=str.charAt(k)){
        		if(str.charAt(j+1)==str.charAt(k))
        			return j;
        		else if(str.charAt(j)==str.charAt(k-1))
        			return k;
        		break;
        	}
        	k--;
        }
        return -1;
    }
    
    
    
    public static boolean palindrome(String str){
    	int j = str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}