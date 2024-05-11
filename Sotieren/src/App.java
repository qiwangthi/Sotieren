import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // erzeugen Sie eine ArrayListe mit 500 zufälligen Integer-Werten im Bereich
        // zwischen 1900 und 2013. Nutzen Sie dazu die statische Methode random der
        // Klasse Math.
        ArrayList<Integer> years = new ArrayList<Integer>();
        // ArrayList<Integer> list2 = new ArrayList<Integer>(list);
        for (int i = 0; i < 500; i++) {
            int randomYear = ((int) (Math.random() * 114) + 1900);
            years.add(randomYear);
        }
        Ausgabe.liste(years);

        // methode von insertSortierer aufrufen
        InsertSortierer insertSortierer = new InsertSortierer(years, 0, 0);
        insertSortierer.startTimer();
        ArrayList<Integer> sortedList = (ArrayList<Integer>) insertSortierer.sortiere();
        insertSortierer.endTimer();

        Ausgabe.liste(sortedList);
        Ausgabe.zeit(insertSortierer.getOperations());

        // methode von quickSortierer aufrufen
        QuickSortierer quickSortierer = new QuickSortierer(years, 0, 0);
        quickSortierer.startTimer();
        ArrayList<Integer> sortedList2 = (ArrayList<Integer>) quickSortierer.sortiere();
        quickSortierer.endTimer();

        Ausgabe.liste(sortedList2);
        Ausgabe.zeit(quickSortierer.getOperations());

    }
}
