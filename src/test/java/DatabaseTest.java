import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DatabaseTest {

    @Test
    public void availableBunsTest() {
        Database database = new Database();

        List<Bun> expectedBuns = new ArrayList<>();
        expectedBuns.add(new Bun("black bun", 100));
        expectedBuns.add(new Bun("white bun", 200));
        expectedBuns.add(new Bun("red bun", 300));

        List<Bun> actualBuns = new ArrayList<>(database.availableBuns());

        Iterator<Bun> expectedBunsListIterator = expectedBuns.iterator();
        Iterator<Bun> actualBunsListIterator = actualBuns.iterator();

        while (expectedBunsListIterator.hasNext()) {
            Bun expectedBun = expectedBunsListIterator.next();
            Bun actualBun = actualBunsListIterator.next();

            String expectedName = expectedBun.getName();
            Float expectedPrice = expectedBun.getPrice();
            String actualName = actualBun.getName();
            Float actualPrice = actualBun.getPrice();

            Assert.assertEquals(expectedName, actualName);
            Assert.assertEquals(expectedPrice, actualPrice);
        }
    }

    @Test
    public void availableIngredientsTest() {
        Database database = new Database();

        List<Ingredient> expectedIngredients = new ArrayList<>();
        expectedIngredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        expectedIngredients.add(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        expectedIngredients.add(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));

        expectedIngredients.add(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        expectedIngredients.add(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        expectedIngredients.add(new Ingredient(IngredientType.FILLING, "sausage", 300));

        List<Ingredient> actualIngredients = new ArrayList<>(database.availableIngredients());

        Iterator<Ingredient> expectedBunsListIterator = expectedIngredients.iterator();
        Iterator<Ingredient> actualBunsListIterator = actualIngredients.iterator();

        while (expectedBunsListIterator.hasNext()) {
            Ingredient expectedIngredient = expectedBunsListIterator.next();
            Ingredient actualIngredient = actualBunsListIterator.next();

            String expectedName = expectedIngredient.getName();
            Float expectedPrice = expectedIngredient.getPrice();
            IngredientType expectedType = expectedIngredient.getType();
            String actualName = actualIngredient.getName();
            Float actualPrice = actualIngredient.getPrice();
            IngredientType actualType = actualIngredient.getType();

            Assert.assertEquals(expectedName, actualName);
            Assert.assertEquals(expectedPrice, actualPrice);
            Assert.assertEquals(expectedType, actualType);
        }
    }
}
