public class ThisPractice // Class name must match the file name if the class is public.
{
    int num = 4; // This is a field (instance variable), not a local variable.

    public void numberMethod(int num) // This is a public method that returns nothing and takes one int parameter named num.
    {
        int foo = this.num; // This gets the field num from the current object.
        int bar = num; // This gets the parameter num passed into the method.

        System.out.println("foo = " + foo); // Prints "foo = 4"
        System.out.println("bar = " + bar); // Prints "bar = 456"
    }

    public static void main(String[] args) // This is the program entry point.
    {
        ThisPractice tp = new ThisPractice(); // Creates a new object (instance) of ThisPractice.
        tp.numberMethod(456); // Calls numberMethod on tp, passing 456 as the argument.
    }
}