public class Elephant extends Animal {


    public Elephant(String name, int age, double weight, String location) {
        super(name, AnimalType.ТРАВОЇДНИЙ, age, weight, location);
    }


    @Override
    public void makeSound() {
        System.out.println(name + " трубить: Труууу!");
    }


    @Override
    public void move() {
        System.out.println(name + " повільно ходить.");
    }


    @Override
    public void feed(Food food) {
        if (food.getType() == FoodType.РОСЛИНИ) {
            hunger = Math.max(0, hunger - food.getNutrition());
            System.out.println(name + " з'їв " + food.getName());
        } else {
            System.out.println(name + " не їсть " + food.getName());
        }
    }
}
