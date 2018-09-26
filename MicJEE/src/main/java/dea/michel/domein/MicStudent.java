package dea.michel.domein;

/**
 * Created by Michel Koolwaaij on 24-09-18.
 */
public class MicStudent implements IStudent{
    private String achternaam;
    private String mail;
    private int id;
    private String voornaam;

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getMail() {
        return mail;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public int getId() {
        return id;
    }



}
