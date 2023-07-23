import java.util.*;

public class Sem3 {
    public static void main(String[] args) {
        task3();

    }
    static void task0(){
        /*Текст задачи:
 Данны следующие строки, сравнить их с помощью == и метода equals() класса Object

 String s1 = "hello";

 String s2 = "hello";

 String s3 = s1;

 String s4 = "h" + "e" + "l" + "l" + "o";

 String s5 = new String("hello");

 String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
       */

        String s1 = "hello";

        String s2 = "hello";

        String s3 = s1;

        String s4 = "h" + "e" + "l" + "l" + "o";

        String s5 = new String("hello");

        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    }


    static void task1(List<Integer> list) {
        /*Текст задачи:
 Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран
         */
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min +1) + min));
        }
        return list;
    }

    static void task2(){
        /*Текст задачи:
 Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку,
 найти и удалить целые числа.*/
        List list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(22);
        list.add("hi");
        list.add(111);
        list.add("privet");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if(o instanceof Integer){
                iterator.remove();
            }
        }

//        for (int i = 0; i < list.size(); i++){
//            if(list.get(i) instanceof Integer){
//                list.remove(i);
//                i--;
//            }
//        }

        System.out.println(list);
    }

    static void task3() {
        /*Текст задачи:
 Каталог товаров книжного магазина сохранен в виде двухмерного списка List<ArrayList<String>> так, что
 на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
 Напишите метод для заполнения данной структуры*/
        // фантастика, марсианин, ...
        // роман, мастер и маргарита, евгений онегин,...
        // классика, пушкин, лермонтов,...
        List<List<String>> bookshop = new ArrayList<>();
        addBook("Фантастика", "Марсианин", bookshop);
        addBook("Роман", "Мастер и Маргарита", bookshop);
        addBook("Фантастика", "Космос", bookshop);
        addBook("Роман", "Евгений Онегин", bookshop);
        addBook("Классика", "Пушкин", bookshop);

        System.out.println(bookshop);

    }

    static void addBook(String ganre, String bookName, List<List<String>> bookShop){
        for (int i = 0; i < bookShop.size(); i++) {
            if(bookShop.get(i).get(0).equals(ganre)){
                bookShop.get(i).add(bookName);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(bookName);
        bookShop.add(list);
    }

}


