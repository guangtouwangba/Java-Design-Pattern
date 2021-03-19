/**
 * @author lenovo
 */
public class CallByEmail implements Strategy {

    @Override
    public void call(String content) {
        System.out.println("Send by email and said "+content);
    }
}
