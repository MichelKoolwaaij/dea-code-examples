package oose.dea;

/**
 * Created by Michel Koolwaaij on 26-09-16.
 */
public class StudentAdapter implements IStudent {
    private ExterneStudent instance;

    public StudentAdapter(ExterneStudent externeStudent) {

        this.instance = externeStudent;
    }

    public String getVoornaam() {

        return instance.getVnaam();
    }

    public String getAchternaam() {

        return instance.getAnaam();
    }

    public String getMail() {
        return instance.getMail();
    }

    public int getId() {

        return instance.getStudentnummer();
    }
}
