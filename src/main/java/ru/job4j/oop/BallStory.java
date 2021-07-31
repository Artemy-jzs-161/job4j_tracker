package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare bugsBunny = new Hare();
        Wolf grayWolf = new Wolf();
        Fox alisa = new Fox();

        kolobok.Song();
        bugsBunny.tryEat(kolobok);
        kolobok.runAwayHare(bugsBunny);

        kolobok.Song();
        grayWolf.tryEat(kolobok);
        kolobok.runAwayWolf(grayWolf);

        alisa.lieToBoll(kolobok);
        kolobok.Song();
        alisa.lieToBoll(kolobok);

        System.out.println("End!!!");

    }
}