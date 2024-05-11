import java.util.List;
import java.util.ArrayList;

public class QuickSortierer extends Sortierer {
    public QuickSortierer(List<Integer> liste, long startTime, long endTime) {
        super(liste, startTime, endTime);
    }

    protected List<Integer> sortiere(List<Integer> liste) {
        List<Integer> ersteListe = new ArrayList<Integer>();
        List<Integer> zweiteListe = new ArrayList<Integer>();
        List<Integer> sortiereteListe = new ArrayList<Integer>();
        // protected List<Integer> quickSort(List<Integer> liste){
        if (liste.size() <= 1) {
            return liste;
        } else {
            int pivotElement = liste.get(0);
            for (int i = 1; i < liste.size(); i++) {
                if (liste.get(i) < pivotElement) {
                    ersteListe.add(liste.get(i));
                } else {
                    zweiteListe.add(liste.get(i));
                }
            }

            ersteListe = sortiere(ersteListe);
            zweiteListe = sortiere(zweiteListe);
            sortiereteListe.addAll(ersteListe);
            sortiereteListe.add(pivotElement);
            sortiereteListe.addAll(zweiteListe);
        }
        return sortiereteListe;
    }
}
