public class PassByValue2
{
    void change(int a)
    {
        a = 99;
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        int a = 5;
        PassByValue2 t = new PassByValue2();
        t.change(a);
        System.out.println(a);
    }
}