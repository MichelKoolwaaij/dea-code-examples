package dea.michel.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Michel Koolwaaij on 12-09-18.
 */
public class TestFizzBuzz {
    private FizzBuzz fb;
    @BeforeEach
    public void init(){
        fb = new FizzBuzz();
    }
    @Test
    public void testIsDeelbaarDoorDrie(){

        // Act
        boolean deelbaarDoorDrie = fb.isDeelbaarDoorDrie(9);
        // Assert
        assertTrue(deelbaarDoorDrie);
    }
    @Test
    public void testIsDeelbaarDoorVijf(){

        // Act
        boolean deelbaarDoorVijf = fb.isDeelbaarDoorVijf(10);
        // Assert
        assertTrue(deelbaarDoorVijf);
    }

    @Test
    public void testIsNietDeelbaarDoorDrieEnVijf(){
        // Act
        boolean nietDeelbaarDoorDrieEnVijf = !fb.isDeelbaarDoorDrie(7) && !fb.isDeelbaarDoorVijf(7);

        // Assert
        assertTrue(nietDeelbaarDoorDrieEnVijf);

    }

    @Test
    public void testPrintFizz(){
        // Act
        String output = fb.output(3);
        // Arrange
        assertEquals("Fizz",output);
    }

    @Test
    public void testPrintBuzz(){
        // Act
        String output = fb.output(5);
        // Arrange
        assertEquals("Buzz",output);
    }

    @Test
    public void testPrintNr(){
        // Act
        String output = fb.output (4);
        //
        assertEquals("4",output);
    }
}
