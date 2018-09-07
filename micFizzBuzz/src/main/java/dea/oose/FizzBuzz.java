package dea.oose;

/**
 * Created by Michel Koolwaaij on 05-09-18.
 */
public class FizzBuzz {
    public void print(int i) throws FizzException, BuzzException {
        /*if(i%3==0) System.out.print("Fizz");
        if(i%5==0) System.out.print("Buzz");
        if (i%3!=0 && i%5!=0) System.out.println(i);
            else System.out.println();*/

        if (i%3==0) throw new FizzException();
        if (i%5==0) throw new BuzzException();

        System.out.println(i);
    }
}
