import java.util.Scanner;
import java.lang.*;
import java.lang.Math;

/* Problem Statement
In the 2-D world of Flatland, the Circles were having their sports day and wanted to end it with a nice formation.
So, they called upon Mr. Sphere from Spaceland for help. Mr Sphere decides to arrange the Circles in square formations.
He starts with N Circles and forms the largest possible square using these Circles.
He then takes the remaining Circles and repeats the procedure. A square of side S requires S*2 Circles to create.

Find the number of squares he will be able to form at the end of the process.
*/

public class Circle
{
    public void getNumberOfSquares() {
        //Take input from the user that how many test cases should be executed
        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = 0;
        System.out.println("Enter the number of times you want to test?");
        if (sc.hasNext()) {
            numberOfTestCases = sc.nextInt();
        }

        //Enter the number of circles
        int arr[] = new int[numberOfTestCases];
        System.out.println("Enter the number of circles");
        for (int i = 0; i < numberOfTestCases; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            //this will act as a counter for the number of squares
            int numberOfSquares = 0;
            while (arr[i] >= 4) {
                //this function shall run recursively until the array data gets reduced to less than 4
                int result = (int) Math.sqrt(Double.valueOf(arr[i]));
                arr[i] = arr[i] - (result * result);
                numberOfSquares++;
            }
            if (arr[i] < 4) {
                //this will handle when the array data is less than 4
                numberOfSquares = numberOfSquares + arr[i];
            }

            System.out.println(numberOfSquares);
        }
    }
}
