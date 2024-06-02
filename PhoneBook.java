// Phonebook ->:
//  addPhone(String name, long nam) - добавить телефон, аргументы имя и сам телефон+
//  removePhone(long nam) - удалить номер, аргумент сам номер+
//  printAll() - печать всех номеров по кол-ву номеров

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<Integer>> book = new HashMap<String, ArrayList<Integer>>();

    public void addPhone(String name, Integer phoneNum) {
        if (book.containsKey(name)) {
            ArrayList<Integer> temp = book.get(name);
            temp.add(phoneNum);
            book.put(name, temp);
        } else {
            ArrayList<Integer> l = new ArrayList<Integer>();
            l.add(phoneNum);
            book.put(name, l);
        }
    }

    public void removePhone(Integer phonNum) {
        Collection<ArrayList<Integer>> tempv = book.values();
        ArrayList<Integer> value = new ArrayList<Integer>();
        for (ArrayList<Integer> f : tempv) {
            if (f.contains(phonNum)) {
                value = f;
            }
        }
        String key = null;
        Collection<String> tempk = book.keySet();
        for (String s : tempk) {
            if (book.get(s).equals(value)) {
                key = s;
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(phonNum);
        ArrayList<Integer> finaly = book.get(key);
        finaly.removeAll(temp);
        if (finaly.size() == 0) {
            book.remove(key);
        } else {
            book.put(key, finaly);
        }

    }

    public void printAll() {

        Collection<String> tempk = book.keySet();
        int countMax = 0;

        for (String st : tempk) {
            if (book.get(st).size() > countMax) {
                countMax = book.get(st).size();
            }

        }

        for (int i = 1; i <= countMax; i++) {
            for (String s : tempk) {
                if (book.get(s).size() == i) {
                    System.out.printf("{%s = %s}", s, book.get(s));
                    System.out.println();
                }
            }
        }

    }

}