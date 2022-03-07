package zyf;

public abstract class Player extends Peason {
    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }
    public abstract void study ();
}
