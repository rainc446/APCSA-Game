public class Level
{
    private boolean goalState;
    private int pointValue;

    public Level (int points, boolean goal) {
        goalState = goal;
        pointValue = points;
    }

    public void setPoints (int points) {
        pointValue += points;
    }

    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached()
    {
        /* implementation not shown */
        this.goalState = true;
        return goalState;
    }
    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints()
    { /* implementation not shown */
        return pointValue;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
