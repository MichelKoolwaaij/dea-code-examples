package nl.han.dea.exercises.model;

public class Student {

    private final String name;

    public Student(String name) {
        this.name = name;
    }

    private void makeNotes(String note) {
        System.out.println("Student " + name + " made note: \n" + note);
    }
}
