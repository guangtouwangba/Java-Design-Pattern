/**
 * @author lenovo
 */
public class HumanResource {

    /*
    *  调用者维持一个strategy的引用,自己进行选择要使用哪个方法
    * */
    private Strategy strategy;

    public HumanResource(){}

    public HumanResource(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void infoInterviewer(){
        strategy.call("你好啊");
    }

    public static void main(String[] args) {
        // HR 开始给面试人员发消息
        HumanResource humanResource = new HumanResource();
        // 选择要使用的方法
        Strategy strategy = new CallByPhone();
        // 讲内部的引用进行设定
        humanResource.setStrategy(strategy);
        // 调用方法
        // 输出 Call by Phone and said 你好啊
        humanResource.infoInterviewer();
    }
}
