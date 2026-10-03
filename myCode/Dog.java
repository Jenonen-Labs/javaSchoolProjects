public class Dog
{
    String name;

    void bark()
    {
        System.out.println(name + " says woof");
    } 
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        dog1.name = "Buddy";
        dog1.bark();
    }
}
