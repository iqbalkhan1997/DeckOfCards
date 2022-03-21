package com.blz.cards;

    import java.util.Scanner;

public class Players {

    public static void players() {
        System.out.println("\nEnter number of players minimum 2, maximum 4 ");
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println(player + " players will  play the game");
        } else {
            System.out.println("please enter number of players in the Range");
        }
    }
}
