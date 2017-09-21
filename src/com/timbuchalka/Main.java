package com.timbuchalka;

public class Main {

    public static void main(String[] args) {


        //...Metodo...\/............PARAMETROS...............\
       /* calculateScore(true, 800, 5, 100);

        //...Metodo...\/..................PARAMETROS.......................\
        calculateScore(true, 10000, 8, 200);


    }

    //Metodo criado para despoluir o main e tornar mais facil de repetir o codigo.
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        //Logica do codigo.
        if (gameOver) {
            // Variaveis Criadas dentro do Bloco de Codigo, nao podem ser chamadas fora dele.
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score Was " + finalScore);*/
        int showScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", showScorePosition);

        int showScorePosition2 = calculateHighScorePosition(900);
        displayHighScorePosition("Roberto", showScorePosition2);

        int showScorePosition3 = calculateHighScorePosition(400);
        displayHighScorePosition("Fabio", showScorePosition3);

        int showScorePosition4 = calculateHighScorePosition(50);
        displayHighScorePosition("Khristian", showScorePosition4);

    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get in position "
                + highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}


//Outra forma de fazer..

       /* boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score is: " + highScore);



        //...Metodo...\/............PARAMETROS...............\
       // calculateScore(gameOver, score, levelCompleted, bonus);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your Final Score is: " + highScore);

        //...Metodo...\/............PARAMETROS...............\
        //calculateScore(gameOver, score, levelCompleted, bonus);*/
