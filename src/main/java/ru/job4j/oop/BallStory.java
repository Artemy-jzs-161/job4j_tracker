package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare bugsBunny = new Hare();
        Wolf grayWolf = new Wolf();
        Fox alisa = new Fox();

        kolobok.song();
        bugsBunny.tryEat(kolobok);
        kolobok.runAwayHare(bugsBunny);

        kolobok.song();
        grayWolf.tryEat(kolobok);
        kolobok.runAwayWolf(grayWolf);

        alisa.lieToBoll(kolobok);
        kolobok.song();
        alisa.lieToBoll(kolobok);

        System.out.println("End!!!");

    }
}