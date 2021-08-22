package ru.job4j.pojo;


import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Иван");
        student.setSecondName("Иванович");
        student.setFamily("Иванов");
        student.setGroup("IT-01");
        student.setDateOfReceipt(LocalDate.of(2015, 7, 1));

        System.out.println("Имя = " + student.getName() + System.lineSeparator()
                + "Отчество = " + student.getSecondName() + System.lineSeparator()
                + "Фамилия = " + student.getFamily() + System.lineSeparator()
                + "Группа = " + student.getGroup() + System.lineSeparator()
                + "Дата поступления = " + student.getDateOfReceipt());
    }
}
