//package abstraction;

class MaineCoon extends Cat{
	int weight = 3;
	String eyeColor = "hazel";

	public void catProperties(){
		System.out.println("Eyecolor: " + eyeColor + "\n" +
				    "Weight: " + weight);
	}
}