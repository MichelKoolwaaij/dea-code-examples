package nl.han.dea.exercises.model;

public class Teacher {

    private final String name;
    private Teachings teachings;

    public Teacher(String name) {
        this.name = name;
        this.teachings = Teachings.getInstance();
    }

    public void teach() {
        while (true) {

            String wisdom = teachings.getWisdom();
            say(wisdom);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private void say(String wisdom) {
        System.out.println(wisdom);
    }
}
