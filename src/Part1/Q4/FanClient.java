package Part1.Q4;

public class FanClient {

    public static void main(String[] args) {
        Fan fan = new Fan(Fan.FAST, true, 10, "yellow");
        
        System.out.println(fan.toString());
    }
}
