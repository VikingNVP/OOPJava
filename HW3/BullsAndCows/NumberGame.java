package HW3.BullsAndCows;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame{

    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }

    @Override
    List<String> generateCharList2(){
        List<String> result2 = new ArrayList<>();
        for (int i = 0; i <= sizeWord; i++) {
            result2.add(String.valueOf(i));
        }
        return result2;
    }
    
}
