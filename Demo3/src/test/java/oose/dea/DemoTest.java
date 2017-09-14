package oose.dea;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Michel Koolwaaij on 14-09-17.
 */
public class DemoTest {
    Student student;
    @Before
    public void initStudent(){
        // init
        student = new Student("Koolwaaij", "Michel");

    }

    @Test
    public void testStudentGetNaam(){

        // test
        String naam = student.getAchternaam();

        // controle
        assertEquals("Koolwaaij",naam);
    }

    @Test
    public void testStudentGetMail(){

        // test
        String mail = student.getMail();

        // controle
        assertEquals("Michel.Koolwaaij@student.han.nl",mail);

    }

    @Test
    public void testStudentGetMailWithSpaces(){
        // init
        Student student = new Student("De Vries", "Michel");

        // test
        String mail = student.getMail();

        // controle
        assertEquals("Michel.DeVries@student.han.nl",mail);

    }

    @Test
    public void testStudentGetVoornaam(){

        // test
        String naam = student.getVoornaam();

        // controle
        assertEquals("Michel",naam);
    }
}
