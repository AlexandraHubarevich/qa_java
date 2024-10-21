import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    String anotherSex;
    @Mock
    Feline feline;


    @Test
    public void lionGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(2);
        //lion.getKittens();
        assertEquals(2,  lion.getKittens());
       // Mockito.verify(feline, Mockito.times(1)).getKittens();

    }

    @Test
    public void hasManeLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }


    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");

    }

    @Test
    public void hasManeLionIncorrectSexTest() throws Exception {
        try {
            Lion lion = new Lion(anotherSex, feline);
            lion.doesHaveMane();
            Assert.fail("Используйте допустимые значения пола животного - самец или самка");
        } catch (Exception thrown) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }

    }
}