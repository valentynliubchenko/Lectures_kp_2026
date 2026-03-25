package ua.nure;

public class AppDataProcessor
{
    public static void main( String[] args )
    {
        Integer[] integers = {5, 2, 8, 1, 9};
        DataProcessor<Integer> intProcessor = new DataProcessor<>(integers);
        System.out.println("Максимум: " + intProcessor.findMax()); // 9
        System.out.println("Середнє: " + intProcessor.average()); // 5.0
//        DataProcessor<String> intProcessor2 = new DataProcessor<>(new String[]{"a","b"});
//        System.out.println("Максимум: " + intProcessor2.findMax()); // 9
//        System.out.println("Середнє: " + intProcessor2.average()); // 5.0

    }
}
