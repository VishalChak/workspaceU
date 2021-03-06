import java.util.Scanner;

class Node{
	int data;
	Node left,right;
}
public class boundryOfTree {
	static Scanner scan = new Scanner (System.in);
	

	public static void main(String args[]){
		int n = scan.nextInt();
		Node temp,root=null;
		for(int i=0;i<n;i++){
			temp= newNode();
			if(root==null)
				root=temp;
			else insert(root,temp);
		}
		System.out.println(max(root));
		//revSorted(root);
		//printBoundry(root);
	}
	
	public static void revSorted(Node root){
		if(root!=null){
			revSorted(root.right);
			System.out.print(root.data+" ");
			revSorted(root.left);
		}
	}
	
	public static Node newNode(){
		Node temp = new Node();
		temp.data=scan.nextInt();
		temp.left=null;
		temp.right=null;
		return temp;
	}
	
	public static void insert(Node root, Node temp){
		if(root!=null){
			if(root.data<=temp.data)
				if(root.right==null)
					root.right=temp;
				else insert(root.right,temp);
			else
				if(root.left==null)
					root.left=temp;
				else insert(root.left,temp);
		}
	}
	
	public static void printLeaf(Node root){
		if(root!=null){
			if(root.left==null && root.right==null)
				System.out.println(root.data);
			printLeaf(root.left);
			printLeaf(root.right);
		}
	}
	
	public static void printLeftBoundry(Node root){
		if(root!=null){
			if (root.left != null) {
                System.out.print(root.data + " ");
                printLeaf(root.left);
            } else if (root.right != null) {
                System.out.print(root.data + " ");
                printLeftBoundry(root.right);
            }
		}
	}
	public static void printRightBoundry(Node root){
		if(root!=null){
			if (root.right != null) {
				printRightBoundry(root.right);
                System.out.print(root.data + " ");
            } else if (root.left != null) {
                printRightBoundry(root.left);
                System.out.print(root.data + " ");
            }
		}
	}
	 
	public static int max(Node root){
		int max=0;
		if(root!=null){
			int data =root.data;
			int l= max(root.left);
			int r= max(root.right),temp;
			if(l>=r)
				temp=l;
			else temp =r;
			 if(temp>data)
				 return temp;
			 else return data;
		} 
		return max;
		
	}
	public static void printBoundry(Node root){
		if(root!=null){
			System.out.println(root.data);
			printLeaf(root);
			printLeftBoundry(root.left);
			printRightBoundry(root.right);
		}

	}
}
