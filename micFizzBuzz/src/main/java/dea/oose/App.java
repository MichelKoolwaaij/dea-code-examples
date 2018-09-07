package dea.oose;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FizzBuzz fb = new FizzBuzz();

        for (int i=1;i<=100;i++){
            try {
                fb.print(i);
            } catch (FizzException e) {
                System.out.println("Fizz");
            } catch (BuzzException e) {
                System.out.println("Buzz");
            }
        }

    }
}
