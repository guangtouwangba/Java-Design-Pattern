public class CallByPhone implements Strategy {

    @Override
    public void call(String content) {
        System.out.println("Call by Phone and said "+content);
    }
}
