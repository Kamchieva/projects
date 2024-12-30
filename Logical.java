package LogicalOperators;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String responce = scanner.nextLine();
        if(!responce.equals("q") || responce.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game *pew pew*");

        }

    }
}
