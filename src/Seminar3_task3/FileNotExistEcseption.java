package Seminar3_task3;

import java.io.FileNotFoundException;

public class FileNotExistEcseption extends FileNotFoundException {
    public FileNotExistEcseption(){
        super();
    }

    public FileNotExistEcseption(String message){
        super(message);
    }
}
