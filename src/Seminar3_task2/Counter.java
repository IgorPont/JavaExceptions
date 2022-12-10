package Seminar3_task2;

public class Counter implements AutoCloseable {
    private int num;

    public int add() {
        return num++;
    }

    @Override
    public void close() throws Exception {
        num = 0; // пример закрытия
    }
}
