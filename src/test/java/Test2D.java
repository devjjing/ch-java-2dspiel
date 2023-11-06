import org.example.Spiel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test2D {

        @Test
        public void playerCharacterTest_whengetx_thenReturn0() {

            //GIVEN
            int number = 0;

            //WHEN
            int actual = Spiel.test(number);

            //THEN
            assertEquals(1, actual);

    }
}
