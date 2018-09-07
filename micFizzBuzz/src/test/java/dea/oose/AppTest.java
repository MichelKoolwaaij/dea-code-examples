package dea.oose;

import org.junit.Test;

public class AppTest
{
    @Test(expected=BuzzException.class)
    public void testFizzBuzzPrintBuzzException() throws FizzException, BuzzException {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        //Act
        fb.print(5);
    }

    @Test(expected=FizzException.class)
    public void testFizzBuzzPrintFizzException() throws FizzException, BuzzException {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        //Act
        fb.print(12);
    }

    @Test
    public void testFizzBuzzPrint() throws FizzException, BuzzException {
        //Arrange
        FizzBuzz fb = new FizzBuzz();
        //Act
        fb.print(11);
    }
}
