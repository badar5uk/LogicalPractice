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
    public static void fixTeen() {

        System.out.print("Enter 3 integers: ");
        Scanner userInput = new Scanner(System.in);
        Integer[] numb = new Integer[3];

        Integer sum = 0;

        for (Integer i = 0; i < numb.length; i++) {
            numb[i] = userInput.nextInt();
            if (numb[i] >12 && numb[i]<20) {
                numb[i] = 0;
                sum += numb[i];
            }
            else if(numb[i]== 15 || numb[i] == 16){
                numb[i] = 0;
                sum += numb[i];
            }
            else {
                sum+=numb[i];
            }

        }
        System.out.println(sum);

    }
        public static void main (String[]args){
            fixTeen();
    }
}

