//class Child extends Parent1, Parent2{
class Child implements Parent1, Parent2{
	
	public void parent1Method(){
		System.out.println("Parent 1 Method");
	}

	public void parent2Method(){
		System.out.println("Parent 2 Method");
	}

	public static void main(String[] args){
		Child child = new Child();
		child.parent1Method();
		child.parent2Method();
	}

}