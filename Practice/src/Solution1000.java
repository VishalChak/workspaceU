import java.util.Scanner;

class Node01{
    int count,data;
    Node01 left,right;
}
public class Solution1000 {
    static Scanner scan = new Scanner (System.in);
    static int arr[],brr[];
    public static void main(String[] args) {
        int a= scan.nextInt(),x;
        Node01 root=null,temp;
        
        for(int i=0;i<a;i++){
            x=scan.nextInt();
            temp = newNode01(x);
            temp.count++;
            if(root==null)
                root=temp;
            else insert(root,temp);
        }
        //print(root);
        int b= scan.nextInt();
        for(int i=0;i<b;i++){
            x=scan.nextInt();
            boolean bo= search(root, x);
            //System.out.println(bo);
            if(!bo){
                temp=newNode01(x);
                insert(root,temp);
                //print(root);
            }
            //print(root);
        }
       print(root);
    }
    
    
    public static void print(Node01 root){
    	if(root!=null){
    		print(root.left);
    		if(root.count!=0)
    			System.out.print(root.data+" ");
    		print(root.right);
    	}
    }
    public static boolean search(Node01 root,int x){
        if(root!=null){
            if(root.data==x){
                root.count--;
                return true;
            } else if(root.data>x)
                return search(root.left,x);
             else return search(root.right,x);
        }
        return false;
    }
    
    
    public static void insert(Node01 root, Node01 temp){
        if(root!=null){
            if(temp.data==root.data) {
                root.count++;
            }
            else if(temp.data<root.data){
                if(root.left==null)
                    root.left=temp;
                else insert(root.left,temp);
            } else{
                if(root.right==null)
                    root.right=temp;
                else insert(root.right,temp);
            }
        }
    }
    
    public static Node01 newNode01(int x){
        Node01 temp = new Node01();
        temp.data= x;
        temp.left=null;
        temp.right=null;
        return temp;
    }
}