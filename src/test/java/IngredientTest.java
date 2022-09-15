import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    @Mock
    IngredientType type;

    @Test
    public void getIngredientNameTest() {
        String expected = "Наименование ингредиента";
        Ingredient ingredient = new Ingredient(type, expected, Mockito.anyFloat());
        String actual = ingredient.getName();
        assertEquals("Имя кто-то поменял", actual, expected);
    }

    @Test
    public void getIngredientPriceTest() {
        Float expected = 1F;
        Ingredient ingredient = new Ingredient(type, Mockito.anyString(), expected);
        Float actual = ingredient.getPrice();
        assertEquals("Цену кто-то поменял", actual, expected);
    }

    @Test
    public void getIngredientTypeTest() {
        IngredientType expected = IngredientType.SAUCE;
        Ingredient ingredient = new Ingredient(expected, Mockito.anyString(), Mockito.anyFloat());
        IngredientType actual = ingredient.getType();
        assertEquals("Тип кто-то поменял", actual, expected);
    }
}
