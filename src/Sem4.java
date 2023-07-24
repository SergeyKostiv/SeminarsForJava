import java.util.*;

public class Sem4 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.peak());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.empty());
        myStack.pop();
        System.out.println(myStack.empty());
    }

    static void task0(){

        /*Текст задачи
1) Замерьте время, за которое в ArrayList добавляеться 10000 элементов.

2) Замерьте время, за которое в LinkedList добавляеться 10000 элементов. Сравните с предыдущим.
         */

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(0,i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(0,i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle-start);
        System.out.println(finish-middle);

    }

    static void task1(){

        /*Текст задачи:
 Реализовать консольное приложение,которое:

 1) Принимает от пользователя строку вида

 text~num

 1) Нужно распплитить строку по ~, сохранить text в связный список на позиции num.
 2) Если введено print~num, выводит строку из позиции num в связаном списке и удаляет ее из списка
          */

        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            switch (text){
                case "print":
                    System.out.println(linkedList.remove(num));
                    break;
                case "exit":
                    System.out.println("До свидания! ");
                    work = false;
                    break;
                default:
                    linkedList.add(num, text);
            }
        }
    }


    static void task2(){
        /*Текст задачи:
Реализовать консольное приложение, которое:

1. Принимает от пользователя и "запоминает" строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
         */

        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator listIterator = linkedList.listIterator(linkedList.size());
                    while (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("До свидания! ");
                    work = false;
                    break;
                case "revert":
                    linkedList.removeLast();
                    break;
                default:
                    linkedList.add(line);
            }
        }

    }


    static void task3(){
        /*Текст задачи:
 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
         */

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }

}

















