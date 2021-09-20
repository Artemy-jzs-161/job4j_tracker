package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl < 0) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] valueEl = {"qaz", "wsx", "edc", "rfv"};
        int a;
        try {
            a = indexOf(valueEl, "edca");
            System.out.println(a);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}