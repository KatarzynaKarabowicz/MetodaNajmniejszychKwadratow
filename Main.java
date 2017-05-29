/**
 * Glowna klasa programu w ktorej wykonuje sie main
 * @author Katarzyna Karabowicz
 *
 */
public class Main {

	public static MetodaNajmniejszychKwadratow metoda;
	
	public static void main(String[] args) {

		metoda=new MetodaNajmniejszychKwadratow();
		metoda.wykonajMetode("wspolrzedne_x.txt","wspolrzedne_y.txt");
	}

}
