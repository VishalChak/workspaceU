import java.util.Scanner;

class snode{
	int data;
	snode next;
}

public class SpacialStack {
  static Scanner scan = new Scanner (System.in);
  public static snode newNode(){
	  snode temp = new snode();
	  temp.data=scan.nextInt();
	  temp.next=null;
	  return temp;
  }
  
  public static void main (String args[]) {
	snode root = null,minroot=null,temp;
	int x;
	do{
		System.out.println("1.Push\n2.Pop\n3.Min");
		x= scan.nextInt();
		switch(x){
		case 1:
			temp = newNode();
			if(root==null){
				root=temp;
				minroot=temp;
			} else {
				temp.next=root;
				root=temp;
				if(temp.data<=minroot.data){
					temp.next=minroot;
					minroot=temp;
				}
			}
			break;
		case 2:
			if(root.data==minroot.data)
				minroot = minroot.next;
			root=root.next;
			break;
		case 3:
			if(root!=null)
			System.out.println(minroot.data);
		}
	}while (x<4 && x>0);
  }
}
