import java.util.Scanner;

public class Solution0001 {
    static Scanner scan = new Scanner(System.in);
    static int arr[];
    public static void main(String[] args) {
     int t= scan.nextInt();
        String str,ttr;
        arr= new int[26];
        boolean b;
        for(int i=0;i<t;i++){
            str =scan.next();
            ttr= scan.next();
            b=false;
            for(int j=0;j<str.length();j++){
                arr[str.charAt(j)-97]++;
            }
            for(int j=0;j<ttr.length();j++){
                if(arr[ttr.charAt(j)-97]>0){
                   b=true;
                    break;
                }
            }
            if(b)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}