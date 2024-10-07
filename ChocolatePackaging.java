import java.util.Iterator;
import java.util.Scanner;

public class ChocolatePackaging {
    /*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2

The example makeChocolate(4, 1, 9):

You have 4 small bars and 1 big bar, and you want to reach a weight of 9 kilos.

Big bars usage:

You can use 1 big bar (since 5 kilos) without exceeding the goal.

Remaining weight:

You’ve used 5 kilos, so you still need 9 - 5 = 4 kilos.

Small bars check:

You have 4 small bars available, which is exactly what you need.

Result: Return 4 because that’s how many small bars you’ll use.


     */


    public static void main(String[]args){
        System.out.println("You are a chocolate factory" + "\n" + "Your goal is to find how to distribute the chocolates in the package ");
        System.out.println(" ");
        System.out.println("Note: A small bar is 1 Kilo" + "\n"+ "A big bar is 5 kilo" + "\n");
        if(scannerInpu() == -1){
            System.out.println("It cant be done");
            System.out.println("You have -1 bars");
        } else{
            System.out.println("You will have "+scannerInpu()+ " small bars required to fill the package");
        }

    }

    public static Integer scannerInpu(){
        Scanner goal = new Scanner(System.in);
        System.out.println("Enter the size of the packaging in Kilos:  ");
        Integer goalInput = goal.nextInt();
        Scanner big = new Scanner(System.in);
        System.out.println("Enter the number of Big bars:  ");
        Integer bigInput = big.nextInt();
        Scanner small = new Scanner(System.in);
        System.out.println("Enter the number of small bars: ");
        Integer smallInput = small.nextInt();
        Integer output = makeChocolate(goalInput, bigInput, smallInput);
        return output;
    }
    public static Integer makeChocolate(Integer g, Integer b, Integer s){
        b = b * 5;
        Integer i  = g - b;
        if(i < s){
            i = -1;
            return i;
        }
        return i;
    }

}
