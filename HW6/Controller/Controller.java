package HW6.Controller;

import HW6.Exception.DividingByZeroException;
import HW6.Io.Data;
import HW6.Io.Printer;
import HW6.Service.CalculateService;

public class Controller {
    double a, b, sum;

    public void init(Data data) {
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }


    public void calc(CalculateService service) throws DividingByZeroException {
        sum = service.calculate(a, b);
    }


    public void done(Printer printer) {
        printer.print("Result: ");
        printer.print(sum);
    }
}
