import java.util.ArrayList;

/**
 * Created by Michel Koolwaaij on 19-09-18.
 */
public class Kok implements IPersoon {
    private String id;
    private ArrayList<IListerer> eters;
    public Kok(String id) {
        this.id = id;
        eters = new ArrayList<IListerer>();
    }

    public void meldAan(IListerer listener) {
        eters.add(listener);
    }

    public void kook() {
        for (IListerer eter: eters){
            eter.roep(id+": Eten is klaar!!!");
        }
    }
}
