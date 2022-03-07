package zyf;

public class BasketballPlayer extends Player {
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃牛肉，喝牛奶");
    }
}
