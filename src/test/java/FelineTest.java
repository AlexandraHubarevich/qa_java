import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatCheck() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyFelineTest() {
        feline.getFamily();
        Mockito.verify(feline, Mockito.times(1)).getFamily();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithParameterCheck() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void getKittensCheck() {
        int expectedKittens = 15;
        feline.getKittens(expectedKittens);
        Mockito.verify(feline, Mockito.times(1)).getKittens(15);


    }

}