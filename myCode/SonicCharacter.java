class SonicCharacter //Think of this like a "blueprint" that creates multiple types of objects.
{
    String name; //This, and age, abilities, and job, etc. is a "field". It's a descriptor for the objects (characters) declared below.
    int age;
    String abilities;
    String job;

    void intro() //This is a method. They enable code reuse, improve readability, and support the divide-and-conquer approach in programming. 
    {
        System.out.println("Introducing... " + name);
    }
    void lifespan()
    {
        System.out.println("They are " + age + " years old.");
    }
    void powers()
    {
        System.out.println("They have " + abilities + " abilities!");
    }
    void occupation()
    {
        System.out.println("They work as " + job + "!");
    }
}
class SonicCharacterTestDrive
{
    public static void main (String[] args)
    {
        SonicCharacter Blaze = new SonicCharacter();//This is an object. "Blaze" is an object reference.
        Blaze.name = "Blaze the Cat!";//After declaring objects, fields and methods can be used to describe these new objects.
        Blaze.intro();
        Blaze.age = 14;
        Blaze.lifespan();
        Blaze.abilities = "Pyrokinesis";
        Blaze.powers();
        Blaze.job = "the Princess of the Sol Empire";
        Blaze.occupation();
        SonicCharacter Whisper = new SonicCharacter();
        Whisper.name = "Whisper the Wolf!";
        Whisper.intro();
        Whisper.age = 16;
        Whisper.lifespan();
        Whisper.abilities = "Sniper";
        Whisper.powers();
        Whisper.job = "a Diamond Cutter";
        Whisper.occupation();
        SonicCharacter Honey = new SonicCharacter();
        Honey.name = "Honey the Cat!";
        Honey.intro();
        Honey.age = 16;
        Honey.lifespan();
        Honey.abilities = "Hyper Mode";
        Honey.powers();
        Honey.job = "a Fashion Designer";
        Honey.occupation();
    }
}