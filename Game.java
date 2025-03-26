import java.util.EnumSet;

public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    public enum Levels {
        One, Two, Three
    }

    private boolean bonusGame;
    /** Postcondition: All instance variables have been initialized. */
    public Game(int[] points, boolean[] goals, boolean bonus)
    {
        levelOne = new Level(points[0], goals[0]);
        levelTwo = new Level(points[1], goals[1]);
        levelThree = new Level(points[2], goals[2]);
        bonusGame = bonus;


        /* implementation not shown */
    }

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    {
        /* implementation not shown */
        return bonusGame;
    }

    public Level getLevel (Levels x) {
        if (x == Levels.One) return levelOne;
        else if (x == Levels.Two) return levelTwo;
        else if (x == Levels.Three) return levelThree;
        return null;
    }

    /** Simulates the play of this Game (consisting of three levels) and updates all relevant * game data
     */
    public void play(int[] score, boolean[] goals, boolean bonus)
    {
        /* implementation not shown */
        getLevel(Levels.One).setPoints(score[0]);
        getLevel(Levels.Two).setPoints(score[1]);
        getLevel(Levels.Three).setPoints(score[2]);

        getLevel(Levels.One).setGoalState(goals[0]);
        getLevel(Levels.Two).setGoalState(goals[1]);
        getLevel(Levels.Three).setGoalState(goals[2]);

        this.bonus = bonus;
    }
    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore()
    {
        int sum = 0;
        if (getLevel(Levels.One).goalReached()) {
            sum += getLevel(Levels.One).getPoints();
            if (getLevel(Levels.Two).goalReached()) {
                sum += getLevel(Levels.Two).getPoints();
                if (getLevel(Levels.Three).goalReached()) {
                    sum += getLevel(Levels.Three).getPoints();
                }
            }
        }

        if (isBonus()) return sum * 3;
        else return sum;
        /* to be implemented in part (a) */
    }
    /** Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num)
    { /* to be implemented in part (b) */
    return  0;}

// There may be instance variables, constructors, and methods that are not shown.
}
