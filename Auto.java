public class Auto {
	private String farbe;
	private int geschwindigkeit;

	public Auto() {
	}

	public Auto(String neueFarbe) {
		farbe = "";
		geschwindigkeit = 0;
		umlackieren(neueFarbe);
	}

	public void umlackieren(String neueFarbe) {
		farbe = neueFarbe;
	}

	public void beschleunigen(int beschleunigung) {
		geschwindigkeit = geschwindigkeit + beschleunigung;
	}

	public void vollbremsen() {
		geschwindigkeit = 0;
	}

	public String toString() {
		return " Auto mit der Farbe " + farbe + " hat die Geschwindigkeit " + geschwindigkeit;
	}

	public static void main(String[] args) {
		Auto a1 = new Auto("Grau"); 		
		Auto a2 = new Auto("Braun");
		
		// a1.umlackieren("Spacegrau"); 
		// a2.umlackieren("Schwarz");
		
		a1.beschleunigen(50); 
		a2.beschleunigen(11);
		
		System.out.println(a1);
		System.out.println(a2);
	}
}

