import java.util.ArrayList;

public class Ausgabe {
    /*
     * Die Methode liste gibt die Elemente einer als Parameter übergebenen Liste
     * auf der Konsole aus
     * - wobei immer 30 Elemente in einer Zeile stehen sollen. Zum Schluss gibt die
     * Methode noch eine
     * Leerzeile aus.
     */
    public static void liste(ArrayList<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i) + " ");
            if ((i + 1) % 30 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // mergeSort
    public static void mergeSort() {
        System.out.println("Sortiert mit MergeSort");
    }

    // quickSort
    public static void quickSort() {
        System.out.println("Sortiert mit QuickSort");
    }

    // inserSort
    public static void insertSort() {
        System.out.println("Sortiert mit InserSort");
    }
    // Rechenzeit
    /*
     * Die Methode zeit erwartet einen long
     * als Parameter, welcher die Rechenzeit in Millisekunden ausgibt. Die Methode
     * gibt die Rechenzeit
     * in Sekunden aus (z.B Benötigte Rechenzeit: 0.3s)
     */

    public static void zeit(long time) {
        System.out.println("Benötigte Rechenzeit: " + time + "s");

    }
}