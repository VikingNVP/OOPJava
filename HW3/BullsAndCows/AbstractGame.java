package HW3.BullsAndCows;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
    Integer sizeWord;
    Integer maxTry;
    int currentTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }
    
    public void restart(Integer sizeWord, Integer maxTry){
        System.out.println("New Game");
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        //computerWord = generateWord();
        computerWord = generateWord2();
        this.gameStatus = GameStatus.START;
        this.currentTry = 0;
    }

    @Override
    public Answer inputValue(String value) {
        if(currentTry >= maxTry){
            gameStatus = GameStatus.FINISH;
            System.out.println("GAME OVER!\n Количества попыток закончились");
            return null;
        }
        int bull = 0;
        int cow = 0;
        for (int i = 0; i < value.length(); i++) {
            if(value.charAt(i) == computerWord.charAt(i)){
                bull++;
                cow++;
            }else if(computerWord.contains(String.valueOf(value.charAt(i)))){
                cow++;
            }
        }
        currentTry++;
        if(sizeWord.equals(bull)){
            gameStatus = GameStatus.FINISH;
            System.out.println("GREAT!!! You Win!");
            return null;
        }
        return new Answer(bull, cow, currentTry);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    abstract List<String> generateCharList();

    private String generateWord(){
        List<String> charList = generateCharList();
        String result = "";
        //todo генерируем слова
        Random random = new Random();
        for (int i = 0; i < charList.size(); i++) {
            int randomIndex = random.nextInt(charList.size());
            result = result.concat(charList.get(randomIndex));
        }
        return result;
        
    }

    abstract List<String> generateCharList2();
    private String generateWord2(){
        List<String> charList2 = generateCharList2();
        Random random = new Random();
        String s = "абвгдеёжзиклмнопрстуфхцчщыъьэюя";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList2.size());
            s.concat(charList2.get(randomIndex));
            charList2.remove(randomIndex);
        }
        return s;
        //генерация строки из кириллицы
    }
    
}
