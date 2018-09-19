package oose.dea;

import javax.inject.Singleton;
import java.sql.SQLException;

/**
 * Created by Michel Koolwaaij on 28-09-16.
 */
public class StudentFactory {

    private IStudent student;
    private static StudentFactory instance;

    private StudentFactory(){

    }

    public static StudentFactory getInstance(){
        if (instance == null){
            instance = new StudentFactory();
        }
        return instance;
    }

    public IStudent createStudent(StudentType type, String vnaam, String anaam, String mail, int id) {
        switch (type){
            case Extern: ExterneStudent externeStudent = new ExterneStudent(vnaam,anaam,mail,id);
                student = new StudentAdapter(externeStudent);
                break;
            case Intern: student = new Student(vnaam,anaam);
                break;
        }
        return student;
    }

}
