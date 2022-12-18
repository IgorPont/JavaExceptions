package Homework03;

import Homework03.Interface.ConsoleView;
import Homework03.Interface.View;
import Homework03.Programme.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
