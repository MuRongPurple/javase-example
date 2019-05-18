package example.lambda.demo2;

/**
 * 定义一个厨子，方法为开始工作
 */
public class Cooker {
    /**
     * 开始工作
     * @param cook 接口实现
     */
    public void startWork(Cook cook){
        cook.makeFood();
    }
}
