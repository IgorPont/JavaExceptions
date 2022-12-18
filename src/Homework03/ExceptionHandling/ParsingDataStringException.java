package Homework03.ExceptionHandling;

public class ParsingDataStringException extends Exception{
    String message;

    public ParsingDataStringException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
