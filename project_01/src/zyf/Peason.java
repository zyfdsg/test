package zyf;
//抽象人类
public abstract class Peason {
    private String name;
    private int age;

    public Peason(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Peason() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();
}
