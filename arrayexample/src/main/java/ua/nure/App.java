package ua.nure;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] numbers = new int[5];
        System.out.println(numbers.length);
        int[] numbers2 = {1, 2, 3, 4, 5,66,44,33};
        System.out.println(numbers2.length);
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] +" ");
        }
        numbers2[4] =12345;
        System.out.println();
        for(int num: numbers2)
            System.out.print(num + " ");


        // Оголошення масиву 3x3
        int[] numbers3 = {4,5,6};
        int[][] matrix = new int[3][3]; // Матриця з 3 рядків і 3 стовпців
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6,555,44,3,22},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        matrix2[2] = numbers2;
        System.out.println("-----------------");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++)
            {
                System.out.print(matrix2[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
