public class SonicMoves 
{
    String moveName;

    void describeMoves()
    {
        System.out.println(moveName + " is one of Sonic's moves.");
    }
    public static void main(String[] args)
    {
        SonicMoves move1 = new SonicMoves();
        move1.moveName = "Spin Dash";
        move1.describeMoves();
        SonicMoves move2 = new SonicMoves();
        move2.moveName = "Homing Attack";
        move2.describeMoves();
    }
}
