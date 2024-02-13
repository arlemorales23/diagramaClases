package composicion.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private List<Ingredient> ingredients;

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double calculatePrice() {
        double totalprice = 0;
        for (Ingredient ingredient : ingredients) {
            totalprice += ingredient.getPrice();
        }
        return totalprice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
