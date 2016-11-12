/* DistanceFromAverage.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   10/5/2016
*/

import java.util.Scanner;

public class DistanceFromAverage
    {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
        {
            double[] numbers = new double[20];
            enterInfo(numbers);
        
        
        }// end main method
    public static void enterInfo(double[] arr)
        {
        for (int i = 0; i <arr.length; i++)
            {
            System.out.print("Enter double value " + (i + 1) + " (Enter 99999 to quit): ");
            arr[i] = scan.nextDouble();
            if (arr[i] == 99999 && i > 0)
                {
                i = arr.length;
                } else
                {
                System.out.println("You have not entered any values!");
                }
            }
        }
    public static double calcDist(double[] arr)
        {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            {
                sum += arr[i];
            }
        
        }
    }
