public class PassByValue
{
    public static void main(String[] args)
    {
        Level myLevel = new Level();
        myLevel.setLevelOfDifficulty(10);

        increaseDifficulty(myLevel);

        System.out.println(myLevel.getLevelOfDifficulty());
    }

    private static void increaseDifficulty(Level level)
    {
        level = new Level();//This creates a new level, which prevents the local variable from being changed from "10".
        level.setLevelOfDifficulty(756);
        //level.setLevelOfDifficulty(level.getLevelOfDifficulty() + 1);
        //If this line was active, this would change myLevel to 11 — but only if 'level' still refers to the original object.
    }
}