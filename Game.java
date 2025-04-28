import java.util.Scanner;

public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;
    private int points;

    /** Postcondition: All instance variables have been initialized. */

    public Game(){
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    {
        /* implementation not shown */
        return bonus;
    }
    public void setBonus() {
        bonus = true;
    }


    /** Simulates the play of this Game (consisting of three levels) and updates all relevant * game data
     */
    public void play()
    {
        System.out.println("Enter The number of points.");
        Scanner s = new Scanner((System.in));
        levelOne.setPoints(s.nextInt());
        levelOne.goalReached();
    }

    public Level getLevel(int level) {
        if (level == 1) return levelOne;
        if (level == 2) return levelTwo;
        if (level == 3) return levelThree;
        return null;
    }

    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore()
    {
        if (levelOne.getGoal()) {
            points += levelOne.getPoints();
            if (levelTwo.getGoal()) {
                points += levelTwo.getPoints();
                if (levelThree.getGoal()) {
                    points += levelThree.getPoints();
                }
            }
        }
        if (isBonus()) {points *= 3;}
        return points;
    }
    /** Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num)
    { /* to be implemented in part (b) */
        int score = 0;
        int max = 0;
        while (num > 0) {
            play();
            points = 0;
            score = getScore();
            if (score > max) max = score;
            num--;
        }
        return max;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

// There may be instance variables, constructors, and methods that are not shown.
}
