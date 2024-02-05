package machine;

import java.util.Scanner;

public class CoffeeMachineLogic {
    static boolean exitProgram = false;

    public static void logic(Inventory inventory) {
        Scanner scanner = new Scanner(System.in);

        do {
            CoffeeMachineInput.actions();
            String action = scanner.next();
            CoffeeMachineInput.userOptions(action, inventory);
        } while (!exitProgram);
    }
}
