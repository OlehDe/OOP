package pr8;

public class Lion extends Animal {

    public Lion(String name, int age, double weight, String location) {
        super(name, AnimalType.ХИЖАК, age, weight, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гарчить: Рррр!");
    }

    @Override
    public void move() {
        System.out.println(name + " бігає по вольєру.");
    }

    @Override
    public void feed(Food food) {
        if (food.getType() == FoodType.МЯСО) {
            hunger = Math.max(0, hunger - food.getNutrition());
            System.out.println(name + " з'їв " + food.getName());
        } else {
            System.out.println(name + " не їсть " + food.getName());
        }
    }
}
