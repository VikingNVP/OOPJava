package HW6;

import HW6.Controller.Controller;
import HW6.Exception.DividingByZeroException;
import HW6.Io.*;
import HW6.Service.*;


import java.util.Scanner;

public class Programm {
    public static void main(String[] args) throws DividingByZeroException {
        //File file = new File("numbers.txt");

        Reader reader = new ReaderConsole(new Scanner(System.in));
        Printer printer = new PrinterConsole();

        Controller controller = new Controller();
        Data data = new DataIO(reader,printer);

        CalculateService sumService = new SumService();
        CalculateService divideService = new DivideService();
        CalculateService subtractService = new SubtractService();
        CalculateService multiplyService = new MultiplyService();

        controller.init(data);
        controller.calc(multiplyService);
        controller.calc(divideService);
        controller.calc(sumService);
        controller.calc(subtractService);
        controller.done(data);
    
    }
}
