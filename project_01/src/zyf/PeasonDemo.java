package zyf;
//测试类
public class PeasonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp=new PingPangPlayer();
        ppp.setName("张又方");
        ppp.setAge(20);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.study();
        ppp.eat();
        ppp.speak();
        System.out.println("-----------------------");
        BasketballPlayer a=new BasketballPlayer("张又方",20);
        System.out.println(a.getName()+a.getAge());
        a.study();
        a.eat();
    }
}
