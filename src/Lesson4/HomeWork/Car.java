package Lesson4.HomeWork;

public class Car {
    private Tank tank;
    private final Engine engine;
    private String name;
    private Integer distance;

    public Car(Engine vwEngine, Tank tank) {
        this.engine = vwEngine;
        this.tank = tank;
        this.distance = 0;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }
    public void turnOn(){
        if (tank.getCurrentAmount() > 0){
            engine.turnOn();
        }
        else {
            System.out.println("Бак пустой");
        }
    }
    public void turnOff(){
        engine.turnOff();
    }
    public void fill(int amount){
        tank.fill(amount);
    }
    public void run(){
        if (engine.isStarted()) {
            distance += 100;
            tank.wastedFuel(15);
            System.out.println("Проехали 100км ");
        }
        else {
            System.out.println("Двигатель выключен");
        }
    }
}



