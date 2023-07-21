package HW6.Service;

import HW6.Exception.DividingByZeroException;

public interface CalculateService {
    double calculate(double a, double b) throws DividingByZeroException, DividingByZeroException;
}
