package 复习.单例模式;

/**
 * @Author DreamYee
 * @Create 2020/02/05  15:47
 */
public class Test {
    public static void a(){
        QinHan qq=QinHan.getInstance();
        QinHan qa=QinHan.getInstance();
        System.out.println(qq==qa);
    }

    public static void main(String[] args) {
        a();
    }
}
