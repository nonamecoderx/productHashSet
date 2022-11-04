import product.Product;
import product.ProductList;
import product.Recipe;
import product.RecipeList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product oil = new Product("Масло", 340, 1);
        Product bread = new Product("Хлеб", 35, 1);
        ProductList productList = new ProductList();
        productList.addProduct(oil, oil.getQuantity());
        productList.addProduct(bread, bread.getQuantity());

        System.out.println(productList);
        Product tomato = new Product("Томат", 60, 5);
        productList.addProduct(tomato, tomato.getPrice());
        System.out.println(productList);

        Recipe recipe1 = new Recipe("Хлеб с маслом", Set.of(oil, bread));
        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        System.out.println(recipe1);


    }

}