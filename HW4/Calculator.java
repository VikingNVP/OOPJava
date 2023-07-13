package HW4;

import java.util.List;

public class Calculator {
    /**
     * @apiNote Написать класс Калькулятор, принимающий List целочисленных значений,
     *  возвращающий сумму элементов коллекции (метод sum)
     * + расширить класс калькулятор на умножение
     * + расширить класс калькулятор на деление
     * + расширить класс калькулятор на бинарный перевод
     * (принимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим образом реализовать, 
     * что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
     * @param numbers массив чисел
     * @return сумма всех элементов массива
     */
    public Double sum(List<? extends Number> numbers){
        Double result = 0.0;
        for (Number number: numbers) {
            result += number.doubleValue();
        }
        return result;
    }
    public Double multi(List<? extends Number> numbers){ //Multiplication
        Double result2 = 0.0;
        for (Number number : numbers) {
            result2 *= number.doubleValue();
        }
        return result2;
    }
    public Double div(List<? extends Number> numbers){ //Division
        Double result3 = 0.0;
        for (Number number : numbers) {
            result3 /= number.doubleValue();
        }
        return result3;
    }
    public static int toDemical(List<? extends Number> numbers) {
        int result = 0;
        for (Number number : numbers) {
            if(number.getNumber() == null) return 0;
            for (int i = 0; i < numbers.size(); i++) {
                result += Integer.parseInt(number.intValue(number.getNumber(i))) + (int)(Math.pow(2, numbers.size()-1-i));
            }
            return result;
        }
    }
    public double getNumber(List<? extends Number> numbers) {
        double res = 0.0;
        for (Number number : numbers) {
            res = number.intValue();
        }
        return res;
    }
}
