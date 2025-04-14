package pr8;

public class Trainer extends ZooEmployee {


    public Trainer(int id, String name, int experience) {
        super(id, name, experience, "Доглядальник");
    }


    public void trainAnimal(Animal animal) {
        System.out.println(name + " тренує " + animal.getName() + "...");
        animal.makeSound();
        animal.move();
    }
}
