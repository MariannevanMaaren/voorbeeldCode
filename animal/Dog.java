package animal;

public class Dog extends Mammal {
	public String breathe() {
		System.out.println("Dog is breathing");
		return "";
	}
	
	public String breathe(String iets) {
		System.out.println("Overloaded " + iets);
		return iets;
		
	}
	
	public int breathe(int bla) {
		System.out.println("Overloaded " + bla);
		return bla;
	}
	
	public void breathe(String dit, int dat) {
		System.out.println(dit + dat);
	}
	
	public void breathe(int dat, String dit) {
		System.out.println(dat + " " + dit);
	}
	
	public void breathe(int zus, int zo) {
		
	}
	
	//public void breathe(int zo, int zus) {} Werkt niet: 2 x zelfde signature, zie regel 28
		
	
}
