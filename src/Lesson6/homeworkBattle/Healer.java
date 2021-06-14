package Lesson6.homeworkBattle;

public class Healer {
    private String name;
    private String weapon;
    private String battleRoar;
    private int healtsPoint;
    private final Integer maxHealtsPoint;



    public void setName(String name) {
        this.name = name;}

    public String getName() {
        return name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;}

    public String getWeapon() {
        return weapon;
    }

    public void setBattleRoar(String battleRoar) {
        this.battleRoar = battleRoar;
    }

    public String getBattleRoar() {
        return battleRoar;}
    public Healer(Integer maxHealPoint){
        this.maxHealtsPoint = maxHealPoint;
        this.healtsPoint = 100;
    }
    // как сделать amount постоянным значением? amount = 20
    public void heal(int amount){
        if (healtsPoint + amount <= maxHealtsPoint) {
            healtsPoint += amount;
        } else {
            System.out.println("Переизбыток исцеления");
        }
    }




}
