public class Array1
{
    float averData(int[] numbers, int size)//Parameters need information from OUTSIDE the method. Ingredients.
    {
        int i, sum;//Spoons and stuff you use to cook.
        for(i=0, sum=0; i<size; i++)
        {
            System.out.println( "population " + (i+1) + " = " + numbers[i] );
            sum += numbers[i];
        }

        return ((float) sum / i);
    }
    public static void main(String[] args) 
    {
        int[] solPopulationBySector = {789, 356, 1024, 3556, 213};
        Array1 a1 = new Array1();
        float avg = a1.averData(solPopulationBySector, solPopulationBySector.length);
        System.out.println("Average population: " + avg);
    }
}