package zyf;
//乒乓球教练类
public class PingPangCoach extends Coach implements SpeakEnglish  {
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练交如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜，喝大米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
