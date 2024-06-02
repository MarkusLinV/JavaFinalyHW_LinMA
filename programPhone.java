
/**
 * 1 класс PhoneBook {name, List<Integer>}
 * 
 * переопределить 2 метода Object: equals и hashcode
 * 
 * Phonebook ->:
 * addPhone(String name, long nam) - добавить телефон, аргументы имя и сам
 * телефон
 * removePhone(long nam) - удалить номер, аргумент сам номер
 * printAll() - печать всех номеров по кол-ву номеров
 * 
 * Comparator - что это такое и примеры кода(google)
 */
public class programPhone {
    public static void main(String[] args) {
        PhoneBook b = new PhoneBook();
        b.addPhone("Иван", 123);
        b.addPhone("Иван", 213);
        b.addPhone("Иван", 321);
        b.addPhone("Пётр", 456);
        b.addPhone("Пётр", 654);
        b.addPhone("Пётр", 465);
        b.addPhone("Пётр", 546);
        b.addPhone("Вова", 789);

        b.printAll();

        b.removePhone(789);
        System.out.println();
        b.printAll();

    }

}