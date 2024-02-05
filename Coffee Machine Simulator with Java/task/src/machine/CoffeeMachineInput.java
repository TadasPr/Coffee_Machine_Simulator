package machine;

import java.util.Scanner;

public class CoffeeMachineInput {
    public static void userOptions(String action, Inventory inventory) {
        Scanner scanner = new Scanner(System.in);
        switch (action) {
            case ProgramOptions.BUY_PROGRAM:
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String coffeeOption = scanner.nextLine();
                try {
                    if (!coffeeOption.equals("back")) {
                        MakeCoffee.coffee(Integer.parseInt(coffeeOption), inventory);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: input format error");
                }
                break;
            case ProgramOptions.FILL_PROGRAM:
                fillOptions(inventory);
                break;
            case ProgramOptions.TAKE_PROGRAM:
                takeMoney(inventory.getMoneyContains());
                inventory.setMoneyContains(0);
                break;
            case ProgramOptions.REMAINING_PROGRAM:
                PrintInventory.printInventory(inventory.getWaterContainsMl(),
                        inventory.getMilkContainsMl(),
                        inventory.getBeansContainsGram(),
                        inventory.getCupsContains(),
                        inventory.getMoneyContains());
                break;
            case ProgramOptions.EXIT_PROGRAM:
                CoffeeMachineLogic.exitProgram = true;
                break;
            default:
                System.out.println("Error: wrong action");
        }
    }

    public static void fillOptions(Inventory inventory) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has to add:");
        inventory.setWaterContainsMl(scanner.nextInt());
        System.out.println("Write how many ml of milk the coffee machine has to add:");
        inventory.setMilkContainsMl(scanner.nextInt());
        System.out.println("Write how many grams of coffee beans the coffee machine has to add:");
        inventory.setBeansContainsGram(scanner.nextInt());
        System.out.println("Write how many disposable cups you want to add:");
        inventory.setCupsContains(scanner.nextInt());
    }

    public static void takeMoney(int money) {
        System.out.println(String.format("I gave you $%d", money));
    }

    public static void actions() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }
}
