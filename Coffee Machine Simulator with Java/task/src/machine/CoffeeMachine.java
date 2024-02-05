package machine;

public class CoffeeMachine {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(StartInventory.WATER_CONTAINS_ML, StartInventory.MILK_CONTAINS_ML, StartInventory.BEANS_CONTAINS_GRAM, StartInventory.CUPS_CONTAINS, StartInventory.MONEY_CONTAINS);
        CoffeeMachineLogic machineLogic = new CoffeeMachineLogic();
        machineLogic.logic(inventory);
    }
}
