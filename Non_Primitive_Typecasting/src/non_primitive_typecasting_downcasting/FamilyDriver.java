package non_primitive_typecasting_downcasting;

public class FamilyDriver {
	
	public static void main(String[] args) {
		Parent upCasted = new Child();
		Child downCasted = (Child)upCasted;
//		can access only Parent and not Child in downCasting
		System.out.println(upCasted.p);
//		System.out.println(upCasted.c);
//		can access both Parent and Child in downCasting
		System.out.println(downCasted.p);
		System.out.println(downCasted.c);
	}
	
	
	
}
