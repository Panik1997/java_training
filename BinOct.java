import java.util.*;
import java.lang.String;

public class BinOct {

    private static List<Integer> binary(int k) {
        List<Integer> tablica = new ArrayList<Integer>();
        for(; k > 0; k /=2){
            tablica.add(k%2);
        }

        Collections.reverse(tablica);
        return tablica;
    }

    private static List<Integer> octal(int z){
        List<Integer> tablica = new ArrayList<Integer>();
        for(; z > 0; z /=8){
            tablica.add(z%8);
        }

        Collections.reverse(tablica);
        return tablica;
    }

    private static String oke(List<Integer> k){
        int a1 = 0;
        int size = k.size();
        int[] tab = new int[size];
        for(Integer t : k){
            tab[a1] = t;
            a1 += 1;
        }
        return Arrays.toString(tab);
    }

    public static void main(String[] args) {
        
        System.out.println(oke(binary(10)));
        System.out.println(oke(octal(10)));

    }
}
