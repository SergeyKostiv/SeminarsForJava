import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2 {
    public static void main(String[] args) {
        task4(repeat(100, "TEST"));
    }

    static String task0(int n, char c1, char c2){
        /* Текст задачи
        Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длинны N, которая состоит
        из чередующихся символов c1 и c2, начиная с c1
         */
        StringBuilder stringBuilder = new StringBuilder();
        if( n % 2 == 0){
            for(int i = 0; i < n/2; i ++){
                stringBuilder.append(c1).append(c2);
            }
            return stringBuilder.toString();
        }else {
            System.out.println("N is not even number");
            return null;
        }
    }


    static String task1(String str){
        /* Текст задачи!
        Напишите метод,который сжимает строку. Пример: вход aaaabbbcdd.
        реультат : a4b3cd2 для примера */
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == chars[i-1]){
                count++;
            } else {
                stringBuilder.append(chars[i-1]).append(count+1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        return stringBuilder.toString();
    }

    static boolean task2(String str){
        /*Текст задачи:
        Напишите метод, который принимает на вход строку (String) и определяет являеться ли строка палиндромом
        (возвращает boolean значение)
         */
        StringBuilder stringBuilder = new StringBuilder(str);
        String str2 = stringBuilder.reverse().toString();
        System.out.println(str);
        System.out.println(str2);
        return str.equals(str2);
    }


    static void task3(String str){
        /*Текст задачи
  Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который
  запишет эту строку в простой текстовый файл, обработайте исключения. */
        String path = "text.txt";
        try(FileWriter writer = new FileWriter(path)) {
            writer.write(str);
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static String repeat(int n, String str){
        return str.repeat(n);
    }


    static void task4(String str){
        /*Текст задачи
  Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который
  запишет эту строку в простой текстовый файл, обработайте исключения. */
        String path = "/f/f/f/f/text.txt";

        Logger logger = Logger.getAnonymousLogger();
        FileHandler handler = null;
        try {
            handler = new FileHandler("log.txt");
        } catch (Exception e){
            e.printStackTrace();
        }

        logger.addHandler(handler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        handler.setFormatter(simpleFormatter);

        try(FileWriter writer = new FileWriter(path, true)) {
            writer.write(str);
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
    }



}
