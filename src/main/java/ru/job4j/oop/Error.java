package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active " + active);
        System.out.println("status " + status);
        System.out.println("message " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printInfo();
        Error error2 = new Error();
        error2.printInfo();
        Error error3 = new Error();
        error3.printInfo();

        Error error4 = new Error(true, 2, "error4");
        error4.printInfo();
        Error error5 = new Error(false, 3, "error5");
        error5.printInfo();
        Error error6 = new Error(true, 4, "error6");
        error6.printInfo();
    }
}
