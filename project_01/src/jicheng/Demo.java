package jicheng;
//提高代码复用性 extends 继承
public class Demo {
    public static void main(String[] args) {
        Fu s=new Fu();
        s.show();
        ZI b=new ZI();
        b.show();
        //多态
        Fu a =new ZI();
    }
}
