public class Sen5 {
    public static void main(String[] args) {


            /*Текст задачи:
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников и организаций

123456 Иванов

321456 Петров

231456 Васильева

123654 Иванов

123546 Васильева

132564 Иванов

Вывести данные по сотрудникам с фамилией Иванов.
     */

        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Петров");
        passports.add("231456", "Васильева");
        passports.add("123654", "Иванов");
        passports.add("123546", "Васильева");
        passports.add("132564", "Иванов");
        System.out.println(passports.getAll());
        System.out.println(passports.getbyLastName("Петров"));
        System.out.println(passports.getbyPass("321456"));
    }
}













