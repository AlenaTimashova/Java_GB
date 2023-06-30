package Homeworks.Exceptions.HW3;

import Homeworks.Exceptions.HW3.Presenter.Presenter;
import Homeworks.Exceptions.HW3.View.ConsoleView;
import Homeworks.Exceptions.HW3.View.View;

public class Program {
    public static void main(String[] args) {
        Presenter<View> program = new Presenter<View>(new ConsoleView());
        program.start();
    }
}
