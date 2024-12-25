package non_primitive_typecasting;

public class FamilyDriver {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent upCasted1 = c; //upcasting (similar to widening implicit in nature)-> storing child class reference to Parent type reference variable
		Parent upCasted2 = new Child(); //upcasting -> storing child class reference to Parent type reference variable
		
		System.out.println("Parent p: "+p);
		System.out.println("Child c: "+c);
		System.out.println("Upcasted1 : "+upCasted1);
		System.out.println("Upcasted2 : "+upCasted2);
		
	}
}
