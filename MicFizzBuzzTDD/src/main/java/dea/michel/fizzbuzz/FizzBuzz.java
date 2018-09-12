package dea.michel.fizzbuzz;

/**
 * Created by Michel Koolwaaij on 12-09-18.
 */
public class FizzBuzz {
    public boolean isDeelbaarDoorDrie(int getal) {
        return (getal % 3 == 0);
    }

    public boolean isDeelbaarDoorVijf(int getal) {
        return (getal % 5 == 0);
    }

    public String output(int getal) {
        if (isDeelbaarDoorDrie(getal)) return "Fizz";
        if (isDeelbaarDoorVijf(getal)) return "Buzz";
        return ""+getal;
    }
}
