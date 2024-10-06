
import java.util.Scanner;

public class SumOfTeen {

    /*
    Given 3 int values, a b c, return their sum.
    However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
    except 15 and 16 do not count as a teens.
    Write a separate helper "public int fixTeen(int n)
    {"that takes in an int value and returns that value fixed for the teen rule.
    In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
    Define the helper below and at the same indent level as the main noTeenSum().

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3

     */
    public static Integer fixTeen(Integer n) {
        switch (n){
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
                return 0;
            default:
                return n;
        }
    }

    public static void noTeenSum(){
        Scanner userInput = new Scanner(System.in);
        Integer sum = 0;
        for (Integer i = 0; i < 3; i++) {
            sum += fixTeen(userInput.nextInt());
            System.out.print("Next: ");
        }
        System.out.println(sum);
    }

    public static void main (String[]args){
        System.out.print("Enter 3 integers: ");
        noTeenSum();
    }
}

