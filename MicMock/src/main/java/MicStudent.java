/**
 * Created by Michel Koolwaaij on 26-09-16.
 */
public class MicStudent{
    private String voornaam;
    private String achternaam;
    private String email;
    static int aantal;
    private int id;
    private ICijferlijst cijfers;


    public MicStudent(String voornaam, String achternaam) {
        id = ++aantal;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = voornaam + "." + achternaam + "@han.nl";

    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setCijferLijst(ICijferlijst cijfers){
        this.cijfers = cijfers;
    }


    public boolean isCumLaude(){
        for (Integer cijfer:cijfers.getLijst()){
            if (cijfer < 8){
                return false;
            }
        }
        return true;
    }
}
