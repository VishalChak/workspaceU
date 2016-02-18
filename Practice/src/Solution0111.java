import java.util.Scanner;

public class Solution0111 {
    static Scanner scan = new Scanner(System.in);
    static int arr[];
    public static void main(String[] args) {
        int t= scan.nextInt(),n;
        for(int i=0;i<t;i++){
            n=scan.nextInt();
            arr= new int[n];
            for(int j=0;j<n;j++)
                arr[j]=scan.nextInt();
            check();
        }
    }
    
    public static void check(){
        int i=0,j=arr.length-1,l=0,r=0;
        while(i+1<=j){
            if(l<r)
                l+=arr[i++];
            else if(r<l)
                r+=arr[j--];
            else{
                l+=arr[i++];
                r+=arr[j--];
            }
        }
        if(l==r)
            System.out.println("YES");
        else System.out.println("NO");
    }
}