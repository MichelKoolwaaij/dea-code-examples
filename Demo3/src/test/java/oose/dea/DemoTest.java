package oose.dea;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Michel Koolwaaij on 14-09-17.
 */
public class DemoTest {
    IStudent student;

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
    
    @Test
    public void testStudentGetId(){
        // init
        IStudent student2 = new Student("De Vries", "Michel");
        
        // test
        boolean idHoger = (student2.getId() > student.getId());
        
        // controle
        assertTrue(idHoger);
    }

    @Test
    public void testExterneStudentGetMail(){
        // init
        ExterneStudent externeStudent = new ExterneStudent("Merel","Arends","M.Arends@externeschool.nl",177);

        // test
        IStudent externeStudentAdapter = new StudentAdapter(externeStudent);

        // controle
        assertEquals("M.Arends@externeschool.nl", externeStudentAdapter.getMail());
    }

    @Test
    public void testStudentFactoryExtern(){
        // Init
        StudentFactory factory = StudentFactory.getInstance();
        IStudent eenStudent = factory.createStudent(StudentType.Extern,"Belle","Beest","Belle.Beest@anderschool.nl",600);

        //Test
        String email = eenStudent.getMail();

        // Controle
        assertEquals("Belle.Beest@anderschool.nl",email);

    }


    @Test
    public void testStudentFactoryIntern(){
        // Init
        StudentFactory factory = StudentFactory.getInstance();
        IStudent eenStudent = factory.createStudent(StudentType.Intern,"Belle","Beest","Beest.Belle@anderschool.nl",600);

        //Test
        String email = eenStudent.getMail();

        // Controle
        assertEquals("Beest.Belle@student.han.nl",email);

    }
}
