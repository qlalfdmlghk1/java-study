package exception.basic.unchecked;

public class Client {
    public void call() throws MyUnCheckedException {
        throw new MyUnCheckedException("ex");
    }
}
