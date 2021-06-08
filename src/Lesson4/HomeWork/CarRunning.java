package Lesson4.HomeWork;

public class CarRunning {
    public static void main(String[] args) {
        Engine vwEngine = new Engine();
        Tank vwTank = new Tank(60);
        Car vw = new Car(vwEngine, vwTank);

    }
}
