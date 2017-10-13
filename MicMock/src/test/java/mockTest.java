import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Michel Koolwaaij on 13-10-17.
 */
public class mockTest {
    private MicStudent student;
    private static final List<Integer> LIJST = new ArrayList<>(Arrays.asList(6,8,9,9));

    @Before
    public void maakStudent(){
        student = new MicStudent("Jan","Van Dam");

    }

    // Een implementatie van ICijferlijst is nooit geprogrammeerd.
    // Toch willen we testen of de methode isCumLaude werkt

    @Test
    public void testStudentIsCumLaude(){
        // Init
        ICijferlijst cijfers = mock(ICijferlijst.class); // Daarom mock ik een cijferlijst m.b.v. mockito
        student.setCijferLijst(cijfers);
        when(cijfers.getLijst()).thenReturn(LIJST); // Als mockito ziet dat de getLijst wordt aangeroepen, gebruik ik een zelfgemaakte lijst.

        // Test
        boolean isCumLaude = student.isCumLaude();

        // Controle
        assertEquals(false,isCumLaude);

    }

}
