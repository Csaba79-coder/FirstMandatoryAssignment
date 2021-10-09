package database.module;

import database.controller.CheckingMethod;
import database.controller.DatabaseController;
import database.util.Print;
import database.util.TxtReader;

public class Processor {

    public void run() {

        new TxtReader().readTxt();

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
