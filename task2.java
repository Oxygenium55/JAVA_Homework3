import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее ариф. из этого списка.

public class task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(100);
            intlist.add(val);
        }
        System.out.println(intlist);
        int max = Collections.max(intlist);
        int min = Collections.min(intlist);
        int maxItem = intlist.get(0);
        int minItem = intlist.get(0);
        int sumItems = 0;
        for (int item : intlist) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/intlist.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
