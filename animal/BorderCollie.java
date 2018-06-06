package animal;

public class BorderCollie extends Dog {
	
	public String name() {
		System.out.println("My name is Sofie.");
		return "";
	}

	public boolean bark() {
		System.out.println("Sofie is barking.");
		return true;
	}
	
	public int age(int ageIn) {
		System.out.println("Sofie is " + ageIn + " years old.");
		return 9;
	}
	
	public String colour() {
		System.out.println("Sofie is black/white.");
		return "";
	}
}
