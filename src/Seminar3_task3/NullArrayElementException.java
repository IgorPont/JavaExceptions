package Seminar3_task3;

public class NullArrayElementException extends IllegalArgumentException {
    public NullArrayElementException() {
        super();
    }

    public NullArrayElementException(String message) {
        super(message);
    }

    public NullArrayElementException(String message, int index) {
        super(message + " NULL element in " + index);
    }
}

