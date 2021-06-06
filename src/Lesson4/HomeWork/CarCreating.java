package Lesson4.HomeWork;

public class CarCreating {
    private Double engine;
    private Integer fuel;
    private Integer distance;

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Double getEngine() {
        return engine;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public void startEngine (){
        System.out.println("Engine is starting");
    }
    public void run (){
        System.out.println("Car is running");
        distance +=50;
        fuel -=5;
    }
    public void engineTurnedOff (){
        System.out.println("Engine is turned off");
    }
    public void cantRunning (){
        System.out.println("If engine is turned off, car can not running");
    }


}
