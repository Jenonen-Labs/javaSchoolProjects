public class Obsessions
{
    public static void main(String[] args)
    {
        String[] obsessions = {"Twilight Sparkle", "Absa the Goat", "Blaze the Cat"};

        int x = obsessions.length;

        System.out.println(x);

        String ts = obsessions[0];
        ts = ts + " " + "is really cool.";
        System.out.println(ts);

        String ab = obsessions[1];
        ab = ab + " " + "is pretty cool as well.";
        System.out.println(ab);

        String btc = obsessions[2];
        btc = "But " + btc + " " + "is the best!";
        System.out.println(btc);
    }

}