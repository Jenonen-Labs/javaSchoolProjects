public class ThisTest
{
    int num = 7;

    public void changeNum(int num)
    {
        this.num = num;
        System.out.println(this.num);
    }

    public static void main(String[] args)
    {
    ThisTest t = new ThisTest();
    t.changeNum(8);
    }
}    
