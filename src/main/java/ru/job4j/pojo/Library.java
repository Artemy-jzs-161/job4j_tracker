package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 464);
        Book javaPhilosophy = new Book("Java Philosophy", 1165);
        Book grockAlgorithms = new Book("Grock Algorithms", 274);
        Book javaTheCompleteGuide = new Book("Java. The complete guide", 1101);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = javaPhilosophy;
        books[2] = grockAlgorithms;
        books[3] = javaTheCompleteGuide;

        for (Book book : books) {
            System.out.println((String.format("Название книги: %s, у нее %s страниц",
                    book.getBookName(), book.getNumberOfPages())));
        }

        System.out.println("Replace 0 element for 3");
        books[3] = cleanCode;
        books[0] = javaTheCompleteGuide;
        for (Book book : books) {
            System.out.println((String.format("Название книги: %s, у нее %s страниц",
                    book.getBookName(), book.getNumberOfPages())));
        }

        System.out.println("print clean code");
        for (Book book : books) {
            if ("Clean Code".equals(book.getBookName())) {
                System.out.println((String.format("Название книги: %s, у нее %s страниц",
                        book.getBookName(), book.getNumberOfPages())));
            }
        }
    }
}
