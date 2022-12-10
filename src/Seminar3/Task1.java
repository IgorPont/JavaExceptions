package Seminar3;

import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try{
            doSomething();
        } catch (IOException e){
            System.out.println("File not found");
        }
    }

    public static void doSomething() throws IOException{
        FileReader fileReader = new FileReader("Non-existent file");
        fileReader.close();
    }
}
