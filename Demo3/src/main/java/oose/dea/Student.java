package oose.dea;

/**
 * Created by Michel Koolwaaij on 14-09-17.
 */
public class Student {

    private String achternaam;
    private String mail;
    private String voornaam;

    public Student(String naam, String voornaam) {
        this.achternaam = naam;
        this.voornaam = voornaam;
        this.mail = voornaam+"."+naam.replaceAll(" ","") +"@student.han.nl";
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
}
