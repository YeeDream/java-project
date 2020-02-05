package 复习.单例模式;

//懒汉模式--线程不安全

/**
 * @Author DreamYee
 * @Create 2020/02/05  15:41
 */
public class LanHan {
    private static LanHan instance;
    private LanHan(){}

    public static LanHan getInstance(){
        synchronized (instance){
            if(instance==null){
                synchronized (instance){
                    instance=new LanHan();
                }
            }
        }
        return instance;
    }
}
