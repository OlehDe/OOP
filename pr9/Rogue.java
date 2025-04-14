package pr9;

public class Rogue extends Character {
    public Rogue(String name, int health) {
        super(name, health);
    }

    @Override
    public void specialAttack() {
        System.out.println(name + " виконує спеціальну атаку: Смертельний удар з тіні!");
    }
}
