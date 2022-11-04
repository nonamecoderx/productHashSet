package product;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final HashSet<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Уже есть такой рецепт");
        } else {
            recipes.add(recipe);
        }
    }
}
