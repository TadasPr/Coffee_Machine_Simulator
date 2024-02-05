package machine;

public class PrintInventory {
    public static void printInventory(int water, int milk, int beans, int cups, int money) {
        System.out.println(String.format("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money", water, milk, beans, cups, money));
    }
}
