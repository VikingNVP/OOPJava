package HW2.Models;

import java.util.ArrayList;

public class ObstacleCourse {
    private ArrayList<Obstacle> obstaclecourse;

    public ObstacleCourse() {
        obstaclecourse=new ArrayList<Obstacle>();
    }
    // Добавляет препятствие из дорожки и стены
    public void obstacleAdd(Obstacle obstacle){
        obstaclecourse.add(obstacle);
    }
    // Возвращает набор препятствий
    public  ArrayList<Obstacle> getObstacles(){ return obstaclecourse;}
}
