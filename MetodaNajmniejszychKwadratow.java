/**
 * Klasa przechowujaca algorytm obliczenia paramentrow a,b metoda najmniejszych kwadratow
 * @author Katarzyna Karabowicz
 *
 */

public class MetodaNajmniejszychKwadratow {
	
	/**
	 * zmienna obiektu typu ListaLiczb
	 */
	public static ListaLiczb x;
	/**
	 * zmienna obiektu typu ListaLiczb
	 */
	public static ListaLiczb y;
	/**
	 * zmienne pomocnicze
	 */
	public static float S,Sx,Sy,Sxx,Sxy,Syy,delta;
	/**
	 * parametry a,b funkcji liniowej postaci y=ax+b
	 */
	public static float a,b;
	
	
	/**
	 * funkcja wykonujaca metode na wartosciach wczytanych z plikow
	 * @param nazwaPlikuX nazwa pliku w ktorym znajduja sie wspolrzedne x
	 * @param nazwaPlikuY nazwa pliku w ktorym znajduja sie wspolrzedne y
	 */
	
	public void wykonajMetode (String nazwaPlikuX, String nazwaPlikuY)
	{
		x=new ListaLiczb();

		y=new ListaLiczb();
		
		x.wczytajListe(nazwaPlikuX);
		y.wczytajListe(nazwaPlikuY);
		
		if (x.ileLiczb()==y.ileLiczb()){
			for(int i=0;i<x.ileLiczb();i++){
				
					
				
				S=i;
				Sx=Sx+x.wezLiczbe(i);
				Sy=Sy+y.wezLiczbe(i);
				Sxx=Sxx+Sx*Sx;
				Sxy=Sxy+Sx*Sy;
				Syy=Syy+Sy*Sy;
				
				delta=S*Sxx-Sx*Sx;
				
				a=(S*Sxy-Sx*Sy)/delta;
				b=(Sxx*Sy-Sx*Sxy)/delta;
				
				
					
			}
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("Funkcja liniowa postaci y="+a+"*x+"+b);
			
		}
		else
			System.out.println("liczba wartosci x i y musi byc rowna");
		
	}

}
