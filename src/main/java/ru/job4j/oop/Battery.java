package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(30);
        System.out.println("Заряд первой батареи равен: " + battery1.load);
        Battery battery2 = new Battery(100);
        System.out.println("Заряд второй батареи равен: " + battery2.load);

        battery1.exchange(battery2);
        System.out.println("Псле зарядки размер  1 батареи равен: " + battery1.load);
        System.out.println("Псле зарядки размер  2 батареи равен: " + battery2.load);

    }

}
