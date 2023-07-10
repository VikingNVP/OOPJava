package HW3.BullsAndCows;

public interface Game {
    void start(Integer sizeWords, Integer maxTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
