package com.robintram;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);


        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

//        Create a method called displayHighScorePosition
//        it should have a player name as a parameter, and a 2nd parameter as a position in the high score table
//        You should display the player's name along with a message like "managed to get into position" and the
//        position they got and a further message "on the high score table."

//        Create a 2nd method called calculateHighScorePosition
//        it should be sent one argument only, the player score
//        it should return an int
//        the return date should be
//        1 if the score is >1000
//        2 if the score is >500 and < 1000
//        3 if the score is >100 and < 500
//        4 in all other cases
//        call both methods and display the results of the following
//        a score of 1500, 900, 400, and 50

        int robinHighScore = calculateHighScorePosition(1500);
        int kevinHighScore = calculateHighScorePosition(900);
        int sarahHighScore = calculateHighScorePosition(400);
        int deborahHighScore = calculateHighScorePosition(50);

        displayHighScorePosition("Robin", robinHighScore);
        displayHighScorePosition("Sarah", sarahHighScore);
        displayHighScorePosition("Kevin", kevinHighScore);
        displayHighScorePosition("Deborah", deborahHighScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if(score > 1000)
            return 1;
        else if (score > 500 && score <= 1000)
            return 2;
        else if (score > 100 && score <= 500)
            return 3;
        else
            return 4;
    }
}
