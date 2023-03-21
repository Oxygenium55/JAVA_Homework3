//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(100);
            intlist.add(value);
        }
        System.out.println(intlist);
        int i = 0;
        while (i < intlist.size()) {
            if (intlist.get(i) % 2 == 0) {
                intlist.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println(intlist);
    }
}