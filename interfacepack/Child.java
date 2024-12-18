package interfacepack;

public class Child implements Parent1, Parent2{
	public void nonStaticMethodOfParent1()
	{
		System.out.println("Non Static Method of Parent 1");
	}

	public void nonStaticMethodOfParent2()
	{
		System.out.println("Non Static Method of Parent 2");
	}

	public static void main(String[] args){
		Child child = new Child();
		//child.staticMethodOfParent1();
		//Parent1.staticMethodOfParent1(); //ClassName as ref
		child.nonStaticMethodOfParent1();
		child.nonStaticMethodOfParent2();
		

	}
}