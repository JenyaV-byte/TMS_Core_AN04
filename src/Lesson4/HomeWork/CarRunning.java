package Lesson4.HomeWork;

public class CarRunning {
    public static void main(String[] args) {
        Engine vwEngine = new Engine();
        Tank tank = new Tank(60);
        Car vw = new Car(vwEngine, tank);
        System.out.println(vw.getDistance());
        vw.fill(30);
        vw.setName("VW");
        vw.turnOn();
        vw.run();
        vw.turnOff();

    }
}
