public class Array2
{
    public static void main(String[] args)
    {
        int[] solPopulationBySector = {789, 356, 1024, 3556, 213};
        System.out.println("Before the function call... ");
        for(int i=0; i<solPopulationBySector.length; i++)
        {
            System.out.println(" population[" + i + "] = " + solPopulationBySector[i]);
        }
        Array2 a2 = new Array2();
        a2.changeVals(solPopulationBySector);
        System.out.println("After the function call...");
        for(int i=0; i<solPopulationBySector.length; i++)
            System.out.println(" population[" + i + "] = " + solPopulationBySector[i]);
    }    
    public void changeVals(int[] numbers)
    {
        for(int i=0; i<numbers.length; i++)
        {
            numbers[i] += 10;
        }
    }
}
