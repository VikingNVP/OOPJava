package HW6.Service;

public class SumService implements CalculateService{
    @Override
    public double calculate(double a, double b){
        return a + b;
    }
}
