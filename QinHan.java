package 复习.单例模式;

//勤汉模式--线程安全
/**
 * @Author DreamYee
 * @Create 2020/02/05  15:40
 */
public class QinHan {
    //私有的静态变量
    private static QinHan qq=new QinHan();
    private QinHan(){}

    public static QinHan getInstance(){
        return qq;
    }
}
