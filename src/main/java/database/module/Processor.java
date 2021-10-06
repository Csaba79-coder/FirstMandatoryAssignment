package database.module;

import database.controller.CheckingMethod;
import database.controller.DatabaseController;
import database.controller.PreparedStatement;
import database.util.Print;

public class Processor {

    public void run() {

        Print print = new Print();

        print.printText(new CopyRight().addingCopyright());

        new CheckingMethod().runChecking();
        print.printText(CopyRight.addingMessage(CopyRight.MESSAGE));

        try {
            Object obj = new DatabaseController().selectAll();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
