import java.util.List;
import java.util.ArrayList;

public class InsertSortierer extends Sortierer {
    public InsertSortierer(List<Integer> liste, long startTime, long endTime) {
        super(liste, startTime, endTime);
    }

    protected List<Integer> sortiere(List<Integer> liste) {

        ArrayList<Integer> sortedList = new ArrayList<Integer>(liste);
        for (int i = 1; i < sortedList.size(); i++) {
            int currentElement = sortedList.get(i);
            int j = i - 1;
            while (j >= 0 && sortedList.get(j) > currentElement) {
                sortedList.set(j + 1, sortedList.get(j));
                j--;
            }
            sortedList.set(j + 1, currentElement);
        }
        return sortedList;
    }
}