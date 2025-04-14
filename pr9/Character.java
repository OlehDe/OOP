package pr9;

public abstract class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Захист
    public void defend() {
        System.out.println(name + " захищається без обладунку.");
    }

    public void defend(String shieldType) {
        System.out.println(name + " захищається з використанням: " + shieldType);
    }

    // Атака
    public void attack() {
        System.out.println(name + " атакує без зброї.");
    }

    public void attack(String weapon) {
        System.out.println(name + " атакує з використанням: " + weapon);
    }

    // Спеціальна атака (буде перевизначена)
    public abstract void specialAttack();
}
