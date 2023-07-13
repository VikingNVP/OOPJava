package HW4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            doubleList.add((double)i);
            integerList.add(i);
        }
        System.out.println("doubleList сумма "+ calc.sum(doubleList));
        System.out.println("integerList сумма "+ calc.sum(integerList));
        System.out.println("doubleList умножение "+ calc.multi(doubleList));
        System.out.println("doubleList деление "+ calc.div(doubleList));
        System.out.println("integerList умножение "+ calc.multi(integerList));
        System.out.println("integerList деление "+ calc.div(integerList));
        System.out.println(Calculator.toDemical(integerList));
    }
}
