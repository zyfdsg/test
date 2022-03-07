package zyf;
//抽象教练类
public abstract class Coach extends Peason {
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }
    public abstract void teach();
}
