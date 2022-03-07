package zyf;
public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public PingPangPlayer() {
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何接球和发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃窝窝头，喝小米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
