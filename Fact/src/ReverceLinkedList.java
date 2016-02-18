import java.util.Scanner;


class List{
	int data;
	List next;
}

public class ReverceLinkedList {
 static Scanner scan = new Scanner(System.in);
 public static void main(String args[]){
	 List root=null,temp;
	 int x;
	 do {
		 System.out.println("1:insert\n2:Delete\n3:Revrse\n4:print");
		 x=scan.nextInt();
		 switch(x){
		 case 1:
			 temp= new List();
			 temp.data=scan.nextInt();
			 temp.next=root;
			 root=temp;
			 break;
		 case 2:
			 root=root.next;
			 break;
		 case 3:
			 root = rev(root);
			 break;
		 case 4:
			 print(root);
			 break;
		 }
	 }while (x<5 && x>0);
 }
 
 public static void print(List root){
	 if(root!=null){
		 System.out.println(root.data);
		 print(root.next);
	 }
 }
 
 
 public static List rev(List root){
	 List pre=null, cur=root, lnext;
	 while(cur!=null){
		 lnext=cur.next;
		 cur.next=pre;
		 pre=cur;
		 cur=lnext;
	 }
	 return pre;
 }
}
