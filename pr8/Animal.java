package pr8;

public abstract class Animal {
    protected String name;
    protected AnimalType species;
    protected int age;
    protected double weight;
    protected int hunger; // 0 - ситий, 100 - голодний
    protected String location;

    public Animal(String name, AnimalType species, int age, double weight, String location) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.hunger = 100;
        this.location = location;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void feed(Food food);

    public String getInfo() {
        return "Назва: " + name +
                ", Вид: " + species +
                ", Вік: " + age +
                ", Вага: " + weight +
                ", Рівень голоду: " + hunger +
                ", Місце: " + location;
    }

    public AnimalType getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }
}
