import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {
    @Mock
    private Feline feline;

    @Test
    public void getFriendsAlex() throws Exception {

        Alex alex = new Alex(feline);
        List<String> actualFriends = alex.getFriends();
        assertEquals(List.of("Zebra: Marty", "Hippopotamus: Gloria", "Giraffe: Melman"), actualFriends);
    }


    @Test
    public void getKittensAlex() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getPlaceOfLivingAlex() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals("New York Zoo", alex.getPlaceOfLiving());
    }

}