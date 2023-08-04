import java.lang.reflect.Array;
import java.util.*;

public class Sem6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Муська", "Иван Петрович", "Мейнкун", 6);
        Cat cat2 = new Cat("Барсик", "Иван Иванович", "Персидская", 8);
        Cat cat3 = new Cat("Муська", "Иван Петрович", "Мейнкун", 6);
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(cat1.equals(cat3));
        System.out.println(set);

    }

    static void task0(){
        /*Текст задачи:
  1. Создайте HashSet, заполните его следующими числами {1, 2, 3, 2, 4, 5, 6,3}. Распечатайте содержимое данного множества.

  2. Создайте LinkedHashSet, заполните его следующими числами {1, 2, 3, 2, 4, 5, 6, 3}. NBSP Распечатайте содержимое данного множества.

  3. Создайте TreeSet, заполните его следующими числами {1, 2, 3, 2, 4, 5, 6, 3}. NBSP Распечатайте содержимое данного множества.
         */
        Integer[] arr = {1, 2, 3, 2, 5, 9, 3, 1, 4, 5, 6, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

    }

    static void task1(Integer[] arr){
        /* Текс задачи:
1. Напишите метод, который заполнит массив из 1000 элементов и с помощью Set вычислите процент уникальных значений в

данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:

процент уникальных чисел = колличествоуникальных чисел * 100 / общее колличество чисел в массиве.
         */
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100.0 / arr.length;
        System.out.println(percent);
    }

    static Integer[] createArr(int size, int max, int min){
        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * ( max - min + 1) + min );

        }
        return arr;
    }

}



















