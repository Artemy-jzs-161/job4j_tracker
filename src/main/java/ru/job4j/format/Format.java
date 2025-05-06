package ru.job4j.format;

import java.util.Calendar;

public class Format {
    public static void main(String[] args) {
        specString("Artem");
        specInt(32);
        specBoolean(1);
        specBoolean(null);
        specChar('b');
        specSeparator();
        getGreetingAndTime("Artem");
        specFloatOrDooble(0.99);
        specSetting(5000000.0000);
    }

    /** спецификатор %s выводит строковое представление аргумента */
    public static void specString(String name) {
        System.out.println(String.format("Привет! Я %s", name));
    }

    /** спецификатор d% мы передаём на форматирование целое число */
    public static void specInt(Integer age) {
        System.out.println(String.format("Мой возраст: %d", age));
    }

    /** %b. Любой переданный аргумент будет превращён в true. Если же передан null, то false */
    public static void specBoolean(Integer i) {
        System.out.println(String.format("Аргумент передан? %b", i));
    }

    /** %c. Задаёт любой символ из таблицы Юникод.*/
    public static void specChar(char c) {
        System.out.println(String.format("Jo%c4j", c));
    }

    /** %n. Задает разделитель строк. */
    public static void specSeparator() {
        System.out.format("Строка1%nСтрока2%n");
    }

    /**
     * %t. Преобразует дату и время. Применяется только с дополнительными флагами.
     * Вид даты и времени здесь спецификаторы %t с флагами F и T.
     * Флаг F выводит дату в формате ISO 8601 - ГГГГ-ММ-ДД,
     * а флаг T выводит время в формате ЧЧ:ММ:СС.
     */
    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format(
                "Привет, %s! Текущая дата: %tF, Текущее время: %tT", name, instance, instance));
    }

    /**
     * %f. Задаёт число с плавающей точкой.
     * По умолчанию при задании числа с плавающей точкой выводится 6 символов после точки.
     * Уменьшить или увеличить количество выводимых после точки символов можно с помощью
     * специальной настройки в виде указания точки и целого числа (.*) перед символом f.
     * Нам нужно 2 символа после точки, поэтому исправим %f на %.2f:
     */

    public static void specFloatOrDooble(double d) {
        System.out.println(String.format("Задаем число 0.99 - %.2f", d));
    }

    /**
     * Специальные настройки. %[индекс_аргумента$][флаг(и)][ширина][.точность]спецификатор
     * - С помощью индекса аргумента можно указать позицию в списке аргументов
     * (в виде целого числа). Например, на первый аргумент можно сослаться в виде 1$,
     * а на четвертый - 4$. Если это явно не указано, то все аргументы должны быть
     * переданы в метод в порядке объявления в шаблоне ссылок на них.
     * <p>
     * - Флаги - это отдельные символы для изменения результата форматирования.
     * Например, флаг "+" добавит знак "+" к получившемуся результату, а флаг "," выведет результат
     * с разделителем между разрядами (запятая или пробел, зависит от локализации).
     * <p>
     * - Ширина определяет количество выводимых символов. Задаётся целым положительным числом.
     * Если перед ним поставить 0, то если общее количество символов строки вывода будет
     * менее этого значения, разница будет заполнена нулями.
     * <p>
     * - Точность мы уже разобрали выше. Через указание точки и целого числа
     * можно задать выводимое после точки количество символов.
     */
    public static void specSetting(double d) {
        System.out.println(String.format("%1$,+016.2f", d));
    }
}

