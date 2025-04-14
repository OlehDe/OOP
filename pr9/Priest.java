package pr9;

public class Priest extends Character {
    public Priest(String name, int health) {
        super(name, health);
    }

    @Override
    public void specialAttack() {
        System.out.println(name + " виконує спеціальну атаку: Священне світло!");
    }
}
