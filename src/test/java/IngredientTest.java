import org.junit.Test;
import org.mockito.Mock;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    @Mock
    IngredientType type;

    @Test
    public void getIngredientNameTest() {
        String ingredientName = "Наименование ингредиента";
        Ingredient ingredient = new Ingredient(type, ingredientName, 1F);

        String expected = "Наименование ингредиента";
        String actual = ingredient.getName();
        assertEquals("Имя кто-то поменял", actual, expected);
    }

    @Test
    public void getIngredientPriceTest() {
        float price = 1F;
        Ingredient ingredient = new Ingredient(type, "Mockito.anyString()", price);

        Float expected = 1F;
        Float actual = ingredient.getPrice();
        assertEquals("Цену кто-то поменял", actual, expected);
    }

    @Test
    public void getIngredientTypeTest() {
        IngredientType ingredientType = IngredientType.SAUCE;
        Ingredient ingredient = new Ingredient(ingredientType, "Mockito.anyString()", 1F);

        IngredientType expected = IngredientType.SAUCE;
        IngredientType actual = ingredient.getType();

        assertEquals("Тип кто-то поменял", actual, expected);
    }
}
