package HW2.Services;

public class Motion implements Imotion {
    public boolean jump(double height, double maxheight) {
        if (height<maxheight){
            return true;
        }else return false;
    }

    public boolean run(int distance, int maxdistance) {
        if (distance < maxdistance){
            return true;
        }else return false;
    }
}
