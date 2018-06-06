package startPackage;

import animal.Animal;
import animal.BorderCollie;
import animal.Dog;
//import animal.BorderCollie;
import animal.Mammal;

public class Starter {
	public static void main (String[] args) {
		
		//BorderCollie g = new Animal(); BorderCollie is kleiner, Animal past dus niet in BorderCollie. 
		// Superclass past niet in subclass.
		
		Animal t = new Mammal();
		t.breathe();
		
		Mammal myFirstDog = new Dog();
		myFirstDog.breathe();
		
		//Dog sofie = new Dog();
		//sofie.breathe("Sofie is breathing");
		//sofie.breathe(8);
		//sofie.breathe(9, "hallo");
		
		Dog bc = new BorderCollie();
		bc.name();
		bc.bark();
		bc.age(6);
		bc.colour();
		
		
	}
	
	
}
