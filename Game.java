import java.util.Scanner;

public class Game
{
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    private boolean bonusGame;
    /** Postcondition: All instance variables have been initialized. */

    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    {
        /* implementation not shown */
        return bonusGame;
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
        /* implementation not shown */
        s.close();
        System.out.println("Enter The number of points.");
    }
    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore()
    {
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
