package HW2.Models;

import java.util.ArrayList;
import java.util.Arrays;
import HW2.DesktopFormOutput;
import HW2.IOutput;

public class Team {
   private  String [] arr;
   private ArrayList<Runner> team;
   private String teamname;

   private IOutput output;
    public Team(String teamname){
        this.team = new ArrayList<Runner>();
        this.teamname = teamname;
        output = new DesktopFormOutput(teamname);
    }
    // Добавляем участника в команду
    public void addRunner(Runner runner){
        team.add(runner);
    }
    // Информация о команде
    public void getTeamInfo(){
        arr = new String[team.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = team.get(i).getInfo();
        }
        //console output
        output.print( "Команда " + teamname + " с составом: " + Arrays.toString(arr));
    }
    // Запуск прохождения командой полосы препятствий
    public void startCompetition(ArrayList<Obstacle> course){
        //output
        output.print("Competition start!");
        for (Obstacle obstacle: course) {
            for (int i = 0; i < arr.length; i++) {
                if (team.get(i).getCondition())
                //output
                output.print(team.get(i).getRunResult(obstacle.getRoadLength()));
                if (team.get(i).getCondition())
                //output
                output.print(team.get(i).getJumpResult(obstacle.getWallHeight()));
            }
        }
    }
    // Определяем победителя
    public void getWinner(){
        for (Runner runner : team){
            if (runner.getCondition()) {
                //console output
                output.print("\nПобедитель в команде " + teamname + " " + runner.info + " !!" );
            }
        }
    }
}
