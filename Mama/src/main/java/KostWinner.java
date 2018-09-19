import java.util.ArrayList;

/**
 * Created by Michel Koolwaaij on 19-09-18.
 */
public class KostWinner implements IPersoon{
    private String id;
    private ArrayList<IListerer> parasieten;

    public KostWinner(String id) {
        this.id = id;
        parasieten = new ArrayList<IListerer>();
    }

    public void meldAan(IListerer listener) {
        parasieten.add(listener);
    }

    public void geefGeld() {
        for (IListerer parasiet: parasieten){
            parasiet.roep(id+": Geld!!!");
        }
    }

}
