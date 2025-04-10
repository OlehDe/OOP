public class Feeder extends ZooEmployee {


    public Feeder(int id, String name, int experience) {
        super(id, name, experience, "Годувальник");
    }


    public void feedAnimal(Animal animal, Food food) {
        if (animal.getSpecies() == AnimalType.ХИЖАК && experience < 2) {
            System.out.println(name + " не має дозволу годувати хижаків.");
        } else {
            animal.feed(food);
        }
    }
}

