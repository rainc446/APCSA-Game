public class Level
{
    private boolean goalState;
    private int pointValue;

    public boolean getGoal () {
        return goalState;
    }

    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public void goalReached()
    {
        /* implementation not shown */
        goalState = true;

    }
    /** Returns the number of points (a positive integer) recorded for this level */
    public int getPoints()
    { /* implementation not shown */
        return pointValue;
    }

    public void setPoints (int points) {
        pointValue = points;
    }
// There may be instance variables, constructors, and methods that are not shown.
}
