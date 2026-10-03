class SonicRank
{
    int score;
    String name;

    void printRank()
    {
        if (score >= 10000)
            {
                System.out.println("Your rank in " + name + " is A");
            }
        else if (score > 7500)
            {
            System.out.println("Your rank in " + name + " is B");
            }
        else if (score > 5000)
            {
            System.out.println("Your rank in " + name + " is C");
            }
        else if (score > 2500)
            {   
            System.out.println("Your rank in " + name + " is D");
            }
        else
            {
            System.out.println("Your rank in " + name + " is E");
            }
    }

    public static void main(String[] args)
    {
        SonicRank stage1 = new SonicRank();
        stage1.name = "Green Hill Zone";
        stage1.score = 13500;
        stage1.printRank();
        SonicRank stage2 = new SonicRank();
        stage2.name = "Marble Zone";
        stage2.score = 9001;
        stage2.printRank();
        SonicRank stage3 = new SonicRank();
        stage3.name = "Spring Yard Zone";
        stage3.score = 7770;
        stage3.printRank();
        SonicRank stage4 = new SonicRank();
        stage4.name = "Labyrinth Zone";
        stage4.score = 5555;
        stage4.printRank();
        SonicRank stage5 = new SonicRank();
        stage5.name = "Starlight Zone";
        stage5.score = 4321;
        stage5.printRank();
        SonicRank stage6 = new SonicRank();
        stage6.name = "Scrap Brain Zone";
        stage6.score = 1234;
        stage6.printRank();
    }
}