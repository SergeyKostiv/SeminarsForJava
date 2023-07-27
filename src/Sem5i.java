import java.util.*;

public class Sem5i {
    public static void main (String[] args) {
        task3(" Мороз и солнце день чудесный\n" +
                  " Еще ты дремлешь друг прелестный\n" +
                  " Пора красавица проснись");

    }

    static boolean task1(String str1,String str2) {
        /* Текст задачи:
Даны 2 строки, написать метод, который вернет true, если эти строки являються изоморфными и false если нет. Строки изоморфны,
 если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

1.повторяющие буквы одного слова меняються на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)

Пример 1:

Input: s = "foo", t = "bar"

Output: false

Пример 2:

Input: s = "paper", t = "title"

Output: true
         */
        Map<Character, Character> map = new HashMap<>();
        if(str1.length() != str2.length()){
            return false;
        }
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c2.length ; i++) {
            if (map.containsKey(c1[i])){
                if (c2[i] != map.get(c1[i])) return false;
            }else {
                map.put(c1[i], c2[i]);
            }

        }
        return true;

    }

    static boolean task2(String str){

        /*Текст задачи:
Написать программу, определяющую правильность расстановки скобок в выражении.

Пример 1: a+(d*3) - истина

Пример 2: [a+(1*3) - ложь

Пример 3: [6+(3*3)] - истина

Пример 4:{a}[+]{(d*3)} - истина

Пример 5: <{a}+{(d*3)}> - истина

Пример 6: {a+]}{(d*3)} - ложь
         */
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        map.put('<','>');
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (c[i] == '(') stack.push(c[i]);
//            if(c[i] == ')'){
//                if(stack.isEmpty() || stack.pop() != '('){
//                    return false;
//                }
//            }
//
//        }
        for (int i = 0; i < c.length; i++) {
            if(map.containsKey(c[i])) stack.push(c[i]);
            if(map.containsValue(c[i])){
                if(stack.isEmpty() || map.get(stack.pop()) !=c[i]) return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

    static void task3(String str){
        /*Текст задачи:
       Взять набор строк, например:
        Мороз и солнце, день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица проснись

 Написать метод, который отсортирует эти строки по длинне с помощью TreeMap Строки с одинаковой длинной не должны потеряться
         */

        str = str.replace("\n"," ");
        str = str.replace(","," ");
        String[] words = str.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word:
            words) {
            int len = word.length();
            if (map.containsKey(len)){
                List<String> list = map.get(len);
                list.add(word);
            }else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }

        }
        System.out.println(map);
    }

}



















