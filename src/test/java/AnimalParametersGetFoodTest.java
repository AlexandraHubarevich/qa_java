import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParametersGetFoodTest {

    @Parameter
    public String animalKind;
    @Parameter(1)
    public List<String> food;
    @Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Травоядное",List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }
    @Test
    public void getFoodParametersTest() throws Exception {
        Animal animal=new Animal();

        List <String> actual = animal.getFood(animalKind);
        assertEquals(actual,food);
    }
}