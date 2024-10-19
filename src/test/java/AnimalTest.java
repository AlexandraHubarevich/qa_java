import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class AnimalTest {
    String anotherKind;
    @Test
    public void getFamily() {
        Animal animal=new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
    @Test
    public void getFood(){
        try {
            Animal animal=new Animal();
            animal.getFood(anotherKind);
            Assert.fail("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        } catch (Exception thrown) {
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());
        }

    }
}
