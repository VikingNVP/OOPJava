package HW6.Service;

public class MultiplyService implements CalculateService {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
