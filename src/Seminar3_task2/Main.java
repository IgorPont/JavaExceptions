package Seminar3_task2;

public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
        } catch (Exception e) {
            System.out.println("error on close");
        }
    }
}

