import java.util.Scanner;
import java.util.Stack;

class Tnode{
	int data;
	Tnode left,right;
}

public class BoundryElementOfTree {
	static Scanner scan = new Scanner(System.in);
	static Stack  stk = new Stack<>();
	public static void main(String args[]){
		Tnode root=null,temp;
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			temp=newNode();
			if(root==null)
				root=temp;
			else insert(root, temp);
		}
		//mirror(root);
		print(root);
	}
	
	public static int  isGivenSum(Tnode root,int k){
		if(root!=null){
			System.out.println("Hee");
			int l =isGivenSum(root.left, k);
			int r= isGivenSum(root.right, k);
			if(root.data+l==k)
				return root.data+l;
			else if(root.data+r==k)
				return root.data+r;
		}
		return 0;
	}
	
	public static void leftBoundry(Tnode root){
		if(root!=null){
			if(root.left!=null){
				System.out.print(root.data+" ");
				leftBoundry(root.left);
			}
			else if(root.right!=null) {
				System.out.print(root.data+" ");
				leftBoundry(root.right);
				}
		}
	}
	
	public static boolean isBST(Tnode root){
		if(root!=null){
			if(root.left!=null)
				if(root.left.data>root.data)
					return false;
				else return isBST(root.left);
			if(root.right!=null)
				if(root.right.data<root.data)
					return false;
				else return isBST(root.right);
		}
		return true;
	}
	
	
	
	public static void rightBoundry(Tnode root){
		if(root!=null){
			if(root.right!=null){
				System.out.print(root.data+" ");
				rightBoundry(root.left);
			}
			else if(root.left!=null) {
				System.out.print(root.data+" ");
				rightBoundry(root.right);
				}
		}
	}
	public static void leaf(Tnode root){
		if(root!=null){
			if(root.left==null && root.right==null)
				System.out.print(root.data+" ");
			else {
				leaf(root.left);
				leaf(root.right);
			}
		}
	}
	
	public static void print(Tnode root){
		if(root!=null){
			
			print(root.left);
			System.out.print(root.data +" ");
			print(root.right);
		}
	}
	
	public static void mirror(Tnode root){
		Tnode temp;
		if(root!=null){
			temp =root.left;
			root.left = root.right;
			root.right=temp;
			mirror(root.left);
			mirror(root.right);
		}
	}
	
	public static void insert(Tnode root,Tnode temp){
		if(temp.data<=root.data)
			if(root.left==null)
				root.left=temp;
			else insert(root.left, temp);
		else{
			if(root.right==null)
				root.right=temp;
			else insert(root.right, temp);
		}
	}
	
	public static Tnode newNode(){
		Tnode temp = new Tnode();
		temp.data=scan.nextInt();
		temp.left=null;
		temp.right=null;
		return temp;
	}
}
