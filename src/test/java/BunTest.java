import org.junit.Test;
import org.mockito.Mockito;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getBunPriceTest() {
        Float expected = 2F;
        Bun bun = new Bun(Mockito.anyString(), expected);
        Float actual = bun.getPrice();
        assertEquals("Цена булочки была незаконно изменена", actual, expected);
    }

    @Test
    public void getBunNameTest() {
        String expected = "Имя";
        Bun bun = new Bun(expected, Mockito.anyFloat());
        String actual = bun.getName();
        assertEquals("Имя булочки было незаконно изменено", actual, expected);
    }
}
