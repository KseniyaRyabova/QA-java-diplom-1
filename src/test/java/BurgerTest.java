import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    //есть ли какой-то способ для мокирования класса,
    // что каждый раз не вызывать аннотацию? Кроме метода mock()?
    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    @Mock
    Burger burger;

    @Test
    public void getBurgerPriceWithOneIngredient() {
        when(bun.getPrice()).thenReturn(1F);
        when(ingredient.getPrice()).thenReturn(2F);

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        Float actual = burger.getPrice();
        Float expected = 4F;

        assertEquals("Неправильный расчет", expected, actual);
    }

    @Test
    public void getReceiptForBurger() {
        when(bun.getName()).thenReturn("Вкусняшная пшеничная булочка");
        when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        when(ingredient.getName()).thenReturn("Котлетка");
        when(burger.getPrice()).thenReturn(0f);

        String bunName = bun.getName();
        String ingredientType = ingredient.getType().toString().toLowerCase(Locale.ROOT);
        String ingredientName = ingredient.getName();
        Float burgerPrice = burger.getPrice();

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        String actual = burger.getReceipt();
        String expected = String.format(
                "(==== %s ====)%n" +
                        "= %s %s =%n" +
                        "(==== %s ====)%n" +
                        "%nPrice: %f%n",
                bunName, ingredientType, ingredientName, bunName, burgerPrice);

        assertEquals("Бургер не тот", expected, actual);
    }

}
