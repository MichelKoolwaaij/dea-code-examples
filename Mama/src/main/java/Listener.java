/**
 * Created by Michel Koolwaaij on 19-09-18.
 */
public class Listener implements IListerer {
    private String id;
    public Listener(String id) {
        this.id = id;
    }

    public void roep(String boodschap) {
        System.out.println(id+" komt aangerend, want: "+boodschap);
    }
}
