package Seminar3_task3;
// сощдаем свои сключения, наследуя от соответствующего исключения


public class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException() {
        super();
    }

    public DivisionByZeroException(String message) {
        super(message);
    }

    public DivisionByZeroException(String message, Throwable th) {
        super(message + th.getStackTrace());
    }
}
