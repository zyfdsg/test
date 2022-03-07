package duoTai;

public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a=new cat();
        a.setName("加菲");
        a.setAge(20);
        System.out.println(a.getName()+a.getAge()+"岁");
        a.eat();
        a=new dog();
        a.setName("大白");
        a.setAge(20);
        System.out.println(a.getName()+a.getAge()+"岁");
        a.eat();
    }
}
