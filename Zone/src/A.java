
public class A {
 public void xyz(){
	 System.out.println("A");
 }
 
 public static void main(String args[]){
	 B b= new B();
//	 b.xyz();
//	 B b = new A();
	 A a = new A();
	 A c = new B();
	 a.xyz();
	 b.xyz();
	 c.xyz();
 }
}

class B extends A{
	public void xyz(){
		System.out.println("B");
	}
}
