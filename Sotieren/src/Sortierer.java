import java.util.ArrayList;
import java.util.List;

public abstract class Sortierer {
    private List<Integer> liste;
    private long startTime;
    private long endTime;

    // Der Konstruktor
    public Sortierer(List<Integer> liste, long startTime, long endTime) {
        this.liste = liste;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // getter Methode
    public List<Integer> getListe() {
        return liste;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // startTime
    public void startTimer() {
        this.startTime = System.currentTimeMillis();
    }

    // copy list
    ArrayList<Integer> kopie = new ArrayList<Integer>(liste);

    protected abstract List<Integer> sortiere(List<Integer> liste);

    public List<Integer> sortiere() {
        return sortiere(this.liste);
    }

    // endTime
    public void endTimer() {
        this.endTime = System.currentTimeMillis();
    }

    // differenz zwischen endTime und startTime
    public long getOperations() {
        return this.endTime - this.startTime;
    }

}
