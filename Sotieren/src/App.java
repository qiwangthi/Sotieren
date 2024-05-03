import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // erzeugen Sie eine ArrayListe mit 500 zufälligen Integer-Werten im Bereich
        // zwischen 1900 und 2013. Nutzen Sie dazu die statische Methode random der
        // Klasse Math.
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<Integer> list2 = new ArrayList<Integer>(list);
        for (int i = 0; i < 500; i++) {
            list.add((int) (Math.random() * 114) + 1900);

        }
        // System.out.println(list);
        Ausgabe.liste(list);
        // startTimermethode aufrufen

    }
}
