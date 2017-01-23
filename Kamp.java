import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;
/**
 * Denne klassen skal illustrere et random kamp resultat.
 * 
 * @author (Nicolay Leknes)
 * @version (1.0)
 */
public class Kamp
{
    // instance variables - replace the example below with your own
    private Random rng = new Random();
    private HashMap <Integer,String> resultatListe;
    private int tall;
    private static int maxScore = 99;
    private static final String Utvisning = "Søderlund";
    /**
     * 
     * 
     */
    public Kamp()
    {
        resultatListe = new HashMap<>();
        resultat();  
    }
   
    // Hashmap-> her blir verdier hentet ut
    private void resultat()
    {
        resultatListe.put(1,"0-0");
        resultatListe.put(2,"0-1");
        resultatListe.put(3,"1-0");
        resultatListe.put(4,"0-2");
        resultatListe.put(5,"2-0");
        resultatListe.put(6,"0-3");
        resultatListe.put(7,"3-0");
        resultatListe.put(8,"0-4");
        resultatListe.put(9,"4-0");
        resultatListe.put(10,"0-5");
        resultatListe.put(11,"5-0");
    }
    /**
     * Printer ut alle mulige resultater
     */
    
    public void PrintResultater()
    {
     
    for (String value : resultatListe.values())
    {
        System.out.println("Value = " + value);
    }
    }
   
    /**
     * Outprint der liverpool vinner 2-0
     */
    public void LiverPoolVinner()
    {
        System.out.println("Liverpool Vinner"+" " + resultatListe.get(5));
    }
    
    // Iterer gjennom
    private void Sorter()
    {
        Iterator<Integer> sort = (resultatListe.keySet()).iterator();
     
        while (sort.hasNext())

        {
            int resultat = sort.next();
            System.out.println(resultat);

        }
    }

    /**
     * Printer ut 1 av 11 mulige kampresultater
     */
    public void Generator()
    {
        
        
        for (int index =0; index <1;) {
            tall = rng.nextInt(11) +1;

            String Resultat = resultatListe.get(tall);
            System.out.println("Kampresultat" + " " + Resultat);
            break;
        }

    }
}