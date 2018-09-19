package oose.dea;

/**
 * Created by Michel Koolwaaij on 14-09-17.
 */
public class Student implements IStudent {

    private String achternaam;
    private String mail;
    private String voornaam;
    private int id;
    private static int aantal=0;
    private Geslacht geslacht;

    public Student(String naam, String voornaam) {
        this.achternaam = naam;
        this.voornaam = voornaam;
        this.mail = voornaam+"."+naam.replaceAll(" ","") +"@student.han.nl";
        this.id = aantal++;
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
