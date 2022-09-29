import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getBunPriceTest() {
        float price = 2.5f;
        Bun bun = new Bun("Mockito.anyString()", price);
        System.out.println(bun.getPrice());

        float expected = 2.5f;
        float actual = bun.getPrice();
        assertEquals(expected, actual, 0f);
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
