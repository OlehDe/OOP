package pr9;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Артур", 100);
        Character priest = new Priest("Мелісса", 80);
        Character rogue = new Rogue("Зейн", 90);

        warrior.attack();
        warrior.attack("меч");
        warrior.defend();
        warrior.defend("щит");
        warrior.specialAttack();

        System.out.println();

        priest.attack();
        priest.attack("посох");
        priest.defend();
        priest.defend("священна аура");
        priest.specialAttack();

        System.out.println();

        rogue.attack();
        rogue.attack("кинжал");
        rogue.defend();
        rogue.defend("плащ-невидимка");
        rogue.specialAttack();
    }
}
