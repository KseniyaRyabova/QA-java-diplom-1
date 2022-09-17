import org.junit.Test;
import org.mockito.Mock;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    @Mock
    Bun bun;

    @Test
    public void getBunPriceTest() {
        float price = 2F;
        Bun bun = new Bun("Mockito.anyString()", price);
        System.out.println(bun.getPrice());

        Float expected = 2F;
        Float actual = bun.getPrice();
        assertEquals("Цена булочки была незаконно изменена", expected, actual);
    }

    @Test
    public void getBunNameTest() {
        String bunName = "Имя";
        Bun bun = new Bun(bunName, 1F);

        String expected = "Имя";
        String actual = bun.getName();
        assertEquals("Имя булочки было незаконно изменено", expected, actual);
    }
}
