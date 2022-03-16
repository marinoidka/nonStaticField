import java.util.Arrays;

import pro.learnup.javaqa.group2.chernykh3.Game;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] speeds = {9, 6, 0, 10, 8};
        String[] playersName = {"Nick 9", "Leo 6", "Chris 0", "Alex 10", "Jen 8"};

        Game game = new Game(false);
        game.maxSpeed = 7;

        System.out.println("Количество выбывших игроков: " + game.droppedOut(speeds));
        System.out.println("Скорость выбывших игроков: " + Arrays.toString(game.speedDroppedOut(speeds)));
        System.out.println("Скорость выживших игроков: " + Arrays.toString(game.speedStayedIn(speeds)));
        System.out.println("Имена выживших игроков: " +  Arrays.toString(game.survivors(playersName)));
    }

}
