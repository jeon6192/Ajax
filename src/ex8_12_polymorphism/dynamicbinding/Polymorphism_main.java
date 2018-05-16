package ex8_12_polymorphism.dynamicbinding;

public class Polymorphism_main {
	public static void main(String args[] ) {
		Child c=new Child();
		System.out.println("----------Child c=new Child();----------");
		c.parentPrn();
		c.childPrn();
		System.out.println("c.message : "+c.message);
		
		Parent p;
		p=c;
		System.out.println("----------Parent p=new Child();----------");
		p.parentPrn();
		System.out.println("p.message : "+p.message2);
	}

}
