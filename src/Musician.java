import java.util.ArrayList;
import java.util.HashMap;

public class Musician extends BasicInfo {
    ArrayList<Band> currentBands = new ArrayList<Band>();
    ArrayList<Band> oldBands = new ArrayList<Band>();
    HashMap<Album, String> soloAlbum = new HashMap<Album, String>();

    public Musician(String name, String info, int birthYear) {
        super(name, info, birthYear);
    }

    public ArrayList<Band> getCurrentBands() {
        return currentBands;
    }

    public void setCurrentBands(ArrayList<Band> currentBands) {
        this.currentBands = currentBands;
    }

    public ArrayList<Band> getOldBands() {
        return oldBands;
    }

    public void setOldBands(ArrayList<Band> oldBands) {
        this.oldBands = oldBands;
    }

    public HashMap<Album, String> getSoloAlbum() {
        return soloAlbum;
    }

    public void setSoloAlbum(HashMap<Album, String> soloAlbum) {
        this.soloAlbum = soloAlbum;
    }
}
