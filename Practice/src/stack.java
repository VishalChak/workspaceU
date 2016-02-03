import java.util.Scanner;
import java.util.Vector;


class nodeSt{
	int data;
	nodeSt next;
}


public class stack {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		int n= scan.nextInt(),t;
		nodeSt root=null,temp;
		for(int i=0;i<n;i++) {
			temp= newnodeSt();
			if(root==null)
				root=temp;
			else insert(root, temp);
		}
			
		do{
			System.out.println("1:Reverce/n 2:Insert/n 3:Delete/n 4: Print");
			t= scan.nextInt();
			switch (t) {
			case 1:
				root =reverce(root);
				break;
			case 2:
				temp = newnodeSt();
				if(root==null)
					root = temp;
				else insert(root, temp);
				break;
			case 3:
				root = delete(root);
				break;
			case 4:
				temp= root;
				while(temp.next!=null) {
					System.out.print(temp.data+" ");
					temp= temp.next;
				}
				System.out.println(temp.data);
					
			default:
				break;
			}
		} while (t>0 && t< 5);
	}
	
	public static nodeSt delete(nodeSt root){
		int x= scan.nextInt();
		nodeSt pre=null,curr=root;
		while(curr.next!=null){
			if(curr.data==x){
				if(pre==null)
					return curr.next;
				else {
					pre.next=curr.next;
					return root;
				}
			}
			pre=curr;
			curr=curr.next;
		}
		System.out.println("Data is not in list");
		return root;
	}
	
	
	public static nodeSt newnodeSt(){
		nodeSt temp = new nodeSt();
		temp.data=scan.nextInt();
		temp.next=null;
		return temp;
	}
	
	public static void insert(nodeSt root,nodeSt temp) {
		if(root!=null){
			if(root.next==null)
				root.next=temp;
			else insert(root.next, temp);
		}
	}
	
	public static nodeSt reverce(nodeSt root) {
		nodeSt pre=null,curr=root,ne;
		while(curr!=null)  {
			ne= curr.next;
			curr.next=pre;
			pre=curr;
			curr=ne;
		}
		return pre;
			
			
		}
}

