import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Klasa odpowiedzialna za wczytywanie listy liczb z pliku tekstowego do listy
 * @author Katarzyna Karabowicz
 *
 */
public class ListaLiczb  {
	
	/**
	 * lista przechowujaca wartosci typu float
	 */
	private ArrayList<Float> liczby;
	/**
	 * funkcja odpowiedzialna za wczytywanie liczb z pliku
	 * @param nazwaPliku nazwa pliku z ktorego beda wczytywane liczby
	 */
	public void wczytajListe(String nazwaPliku)
	{
     liczby= new ArrayList<Float>();
     
     try {
    	 BufferedReader br= new BufferedReader(new FileReader(nazwaPliku));
    	 String linijka=null;
    	 
    	 while ((linijka=br.readLine()) != null)
    	 {
    		 float liczba = Float.parseFloat(linijka.trim());
    		 liczby.add(liczba);
    	 }
    	 
    	 br.close();
     }
      catch (NumberFormatException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    
	}
	/**
	 * funkcja zwracajaca liczbe elementow w liscie
	 * @return zwraca liczbe elementow
	 */
	public int ileLiczb(){
		return liczby.size();
	}
	
	/**
	 * funkcja zwracaja wartosc elementu znajdujacego sie pod wskazanym indeksem
	 * @param indeks indeks wskazujacy na wybrany element
	 * @return zwraca wartosc
	 */
	public float wezLiczbe(int indeks) {
        return liczby.get(indeks);
    }
	
}
