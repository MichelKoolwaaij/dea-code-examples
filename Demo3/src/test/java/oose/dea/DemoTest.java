package oose.dea;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Michel Koolwaaij on 14-09-17.
 */
public class DemoTest {
    IStudent student;

    @Before
    public void initStudent(){
        // Arrange
        student = new Student("Koolwaaij", "Michel");

    }

    @Test
    public void testStudentGetNaam(){

        // Act
        String naam = student.getAchternaam();

        // Assert
        assertEquals("Koolwaaij",naam);
    }

    @Test
    public void testStudentGetMail(){

        // Act
        String mail = student.getMail();

        // Assert
        assertEquals("Michel.Koolwaaij@student.han.nl",mail);

    }

    @Test
    public void testStudentGetMailWithSpaces(){
        // Arrange
        Student student = new Student("De Vries", "Michel");

        // Act
        String mail = student.getMail();

        // Assert
        assertEquals("Michel.DeVries@student.han.nl",mail);

    }

    @Test
    public void testStudentGetVoornaam(){

        // Act
        String naam = student.getVoornaam();

        // Assert
        assertEquals("Michel",naam);
    }
    
    @Test
    public void testStudentGetId(){
        // Arrange
        IStudent student2 = new Student("De Vries", "Michel");
        
        // Act
        boolean idHoger = (student2.getId() > student.getId());
        
        // Assert
        assertTrue(idHoger);
    }


/*
    @Test
    public void testExterneStudentGetMail(){
        // Arrange
        ExterneStudent externeStudent = new ExterneStudent("Merel","Arends","M.Arends@externeschool.nl",177);

        // Act
        IStudent externeStudentAdapter = new StudentAdapter(externeStudent);

        // Assert
        assertEquals("M.Arends@externeschool.nl", externeStudentAdapter.getMail());
    }

    @Test
    public void testStudentFactoryExtern(){
        // Arrange
        StudentFactory factory = StudentFactory.getInstance();
        IStudent eenStudent = factory.createStudent(StudentType.Extern,"Belle","Beest","Belle.Beest@anderschool.nl",600);

        //Act
        String email = eenStudent.getMail();

        // Assert
        assertEquals("Belle.Beest@anderschool.nl",email);

    }


    @Test
    public void testStudentFactoryIntern(){
        // Arrange
        StudentFactory factory = StudentFactory.getInstance();
        IStudent eenStudent = factory.createStudent(StudentType.Intern,"Belle","Beest","Beest.Belle@anderschool.nl",600);

        // Act
        String email = eenStudent.getMail();

        // Assert
        assertEquals("Beest.Belle@student.han.nl",email);

    }
    */
}
