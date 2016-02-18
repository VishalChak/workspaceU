import java.util.Scanner;

class Node001{
    int data,pos;
}
public class Solution00010 {
    static Scanner scan = new Scanner(System.in);
    static Node001 arr[];
    public static void main(String[] args) {
        int t= scan.nextInt(),n,x;
        Node001 temp;
        for(int i=0;i<t;i++){
            n= scan.nextInt();
            x= scan.nextInt();
            arr = new Node001[n];
            for(int j = 0;j<n;j++){
                temp= new Node001();
                temp.data = scan.nextInt();
                temp.pos = i;
                arr[i]= temp;
            }
            sort(0,n-1);
        }
    }
    
    public static void sort(int l,int r){
        if(l<r){
            int m = partition(l,r);
            sort(l,m-1);
            sort(m+1,r);
        }
    }
    
    
    public static int partition(int l,int r){
        int i=l,j=r,temp,q=arr[l].data;
        System.out.println(arr.length+"........"+q);
        while(i<j){
            while(arr[i].data<=q && i< arr.length-1)
                i++;
            while(arr[j].data>q)
                j--;
            if(i<j){
                temp = arr[i].data;
                arr[i].data= arr[j].data;
                arr[j].data =temp;
            }
        }
        arr[l].data = arr[j].data;
        arr[j].data = q;
        return j;
    }
    
}