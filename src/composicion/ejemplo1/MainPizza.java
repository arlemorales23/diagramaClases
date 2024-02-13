package composicion.ejemplo1;

public class MainPizza {
    public static void main(String[] args) {

        // Create ingredients
        Ingredient cheese = new Ingredient("Cheese", 0.5);
        Ingredient pepperoni = new Ingredient("Pepperoni", 0.75);
        Ingredient ham = new Ingredient("Ham", 0.85);

        // Create a pizza
        Pizza pizza = new Pizza("Supreme Pizza");

        // Add ingredients to the pizza
        pizza.addIngredient(cheese);
        pizza.addIngredient(pepperoni);
        pizza.addIngredient(ham);

        // Print the pizza information
        System.out.println(pizza);

        // Calculate the price of the pizza
        double price = pizza.calculatePrice();

        // Print the price of the pizza
        System.out.println("Total price: $" + price);
    }
}
