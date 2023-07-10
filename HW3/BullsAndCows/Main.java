package HW3.BullsAndCows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Играем в игру BULLS & COWS! Введи действие(число): \n 1 - Новая игра \n 2 - Посмотреть результаты \n 3 - Завершить");
        Scanner sc = new Scanner(System.in);
        Integer s = sc.nextInt();
        switch(s){
            case 1:
                NumberGame numberGame = new NumberGame();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Задайте длину слова и кол-во попыток: ");
                numberGame.start(scanner.nextInt(), scanner.nextInt());
                scanner.nextLine();
                while(!numberGame.getGameStatus().equals(GameStatus.FINISH)){
                    Answer answer = numberGame.inputValue(scanner.nextLine());
                    if(answer != null){
                        System.out.println("Совпадения " + answer);
                    }
                }
                break;
            case 2: System.out.println("NUll");
                break;
            
            default: break;
        }
    }
}
