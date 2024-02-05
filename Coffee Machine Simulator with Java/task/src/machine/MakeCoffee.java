package machine;

public class MakeCoffee {
    public static void coffee(int coffeeOption, Inventory inventory) {
        switch (coffeeOption) {
            case 1:
                if ((inventory.waterContainsMl - CoffeeIngredients.ESPRESSO_WATER) >= 0
                        && (inventory.beansContainsGram - CoffeeIngredients.ESPRESSO_BEANS) >= 0
                        && (inventory.cupsContains - 1) >= 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    inventory.waterContainsMl -= CoffeeIngredients.ESPRESSO_WATER;
                    inventory.beansContainsGram -= CoffeeIngredients.ESPRESSO_BEANS;
                    inventory.cupsContains -= 1;
                    inventory.moneyContains += CoffeeCost.ESPRESSO_COST;
                }else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case 2:
                if ((inventory.waterContainsMl - CoffeeIngredients.LATTE_WATER) >= 0 &&
                        (inventory.beansContainsGram - CoffeeIngredients.LATTE_BEANS) >= 0 &&
                        (inventory.milkContainsMl - CoffeeIngredients.LATTE_MILK) >= 0 &&
                        (inventory.cupsContains - 1) >= 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    inventory.waterContainsMl -= CoffeeIngredients.LATTE_WATER;
                    inventory.beansContainsGram -= CoffeeIngredients.LATTE_BEANS;
                    inventory.milkContainsMl -= CoffeeIngredients.LATTE_MILK;
                    inventory.cupsContains -= 1;
                    inventory.moneyContains += CoffeeCost.LATTE_COST;
                }else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case 3:
                if ((inventory.waterContainsMl - CoffeeIngredients.CAPPUCCINO_WATER) >= 0 &&
                        (inventory.beansContainsGram - CoffeeIngredients.CAPPUCCINO_BEANS) >= 0 &&
                        (inventory.milkContainsMl - CoffeeIngredients.CAPPUCCINO_MILK) >= 0 &&
                        (inventory.cupsContains - 1) >= 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    inventory.waterContainsMl -= CoffeeIngredients.CAPPUCCINO_WATER;
                    inventory.beansContainsGram -= CoffeeIngredients.CAPPUCCINO_BEANS;
                    inventory.milkContainsMl -= CoffeeIngredients.CAPPUCCINO_MILK;
                    inventory.cupsContains -= 1;
                    inventory.moneyContains += CoffeeCost.CAPPUCCINO_COST;
                }else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            default:
                System.out.println("Error: option not available");
        }
    }
}
