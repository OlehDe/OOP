package pr9;

public class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void specialAttack() {
        System.out.println(name + " виконує спеціальну атаку: Розрив мечем!");
    }
}
