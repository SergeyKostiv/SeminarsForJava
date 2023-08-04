import java.util.ArrayList;
import java.util.List;

public class Cat {
    /*Текст задачи:
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложений, которой являеться

а) информационной системой ветеринарной клиники

б) архивом выставки котов

в) информационной системой Театра кошек Ю. Д. Куклачева

Можно записать в текстовом виде, не обязательно реализовывать в java.

1. Реализуйте 1 из вариантов класса Cat из пердыдущего задания, можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.

2. Добейтесь того, чтобы при выводе в консоль обьекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
  */
    /* Текст задачи:
1. Создать множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>, Поместите в него некоторое количество обьектов.

2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все онисохранились во множестве.

3. Создайте метод

**public boolean**

equals(Object o)

Пропишите в нем логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях

4. Создайте метод

**public int hashCode()**

который будет возвращать hash, вычесленный на основе полей класса Cat. (Можно использовать Objects.hash(...))

5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
     */
    private String name;
    private String owner;
    private String bread;
    private int age;
    private List<String> healthHistory;

    public Cat(String name, String owner, String bread, int age){
        this.age = age;
        this.bread = bread;
        this.owner = owner;
        this.name = name;
        healthHistory = new ArrayList<>();

    }
    @Override
    public String toString(){
        return " Имя: " + name + " Хозяин: " + owner + " Возраст: " + age + " Порода: " + bread;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return age == cat.age && name.equals(cat.name) && owner.equals(cat.owner) && bread.equals(cat.bread);

    }

    @Override
    public int hashCode(){
        return 15 * name.hashCode() + 11  * owner.hashCode() + 3 * bread.hashCode() + 23 * age;
    }

}






