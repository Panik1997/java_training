import java.util.*;
import java.lang.String;
import java.util.Collections;
import java.util.ArrayList;

public class NumberIntoListAndArray {

    private static void ConvertToArray(int size1, List<Integer> firstList1){
        int k = 0;
        int[] arrayOfList = new int[size1];


        for(Integer x : firstList1){
            if(k == size1){
                break;
            }
            arrayOfList[k++] = x;
        }

        System.out.println(Arrays.toString(arrayOfList));
    }

    private static List<Integer> ConvertToList(int number){
        List<Integer> firstList = new ArrayList<Integer>();

        for(; number != 0; number /= 10){
            firstList.add(number % 10);
        }

        Collections.reverse(firstList);

        return firstList;
    }
    public static void main(String[] args) {

            System.out.println("Enter the number");
            Scanner x = new Scanner(System.in);
            int y= x.nextInt();
            System.out.println("You entered a number: " + y);

            int howLong = String.valueOf(y).length();

            System.out.println("List of a single numbers: " + ConvertToList(y));
            System.out.print("And now an Array of a single numbers made by using List: ");
            ConvertToArray(howLong, ConvertToList(y));
    }
}
