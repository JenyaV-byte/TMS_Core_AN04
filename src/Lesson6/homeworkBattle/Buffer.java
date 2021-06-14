package Lesson6.homeworkBattle;

public class Buffer {
    private final String name;
    private final String weapon;
    private String battleRoar;


    public Buffer(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void setBattleRoar(String battleRoar) {
        this.battleRoar = battleRoar;
    }

    public String getBattleRoar() {
        return battleRoar;
    }
}
