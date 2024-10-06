import java.util.Scanner;

public class SumOfRoundedValues {
    /*
    Input: 3 integer inputs
    Output: The sum of the values after each number is rounded to the closest 10
    Process: - Taking in user input using Scanner
             - use a roof or ceiling function to round the input
             - Sum of the value and display the input values along the sum.
     */

    public static void main(String[]args){
        Long sum = 0L;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Integers:  ");

        for (Integer i = 0; i < 3; i++) {
            sum += roundSum(scanner.nextInt());
            System.out.print("Next: ");
        }
        System.out.println(sum);
    }
    public static Long roundSum(Integer num){
        long l = Math.round(num / 10.0) * 10;
        return l;
    }

}
