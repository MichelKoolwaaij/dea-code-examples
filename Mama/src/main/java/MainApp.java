/**
 * Created by Michel Koolwaaij on 19-09-18.
 */
public class MainApp {
    public static void main(String[] args){
        IListerer jij = new Listener("jij");
        IListerer jeBroertje = new Listener("je broertje");
        IListerer jeZusje = new Listener("je zusje");
        IListerer jeVriend = new Listener("je vriend");

        Kok mama = new Kok("mama");
        Kok oma = new Kok("oma");
        KostWinner papa = new KostWinner("papa");

        mama.meldAan(jij);
        mama.meldAan(jeZusje);
        mama.meldAan(jeVriend);
        oma.meldAan(jeBroertje);
        papa.meldAan(jeBroertje);
        papa.meldAan(jij);

        mama.kook();
        oma.kook();
        papa.geefGeld();

    }
}
