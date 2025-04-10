public class Monkey extends Animal {


    public Monkey(String name, int age, double weight, String location) {
        super(name, AnimalType.ТРАВОЇДНИЙ, age, weight, location);
    }


    @Override
    public void makeSound() {
        System.out.println(name + " кричить: У-у-у!");
    }


    @Override
    public void move() {
        System.out.println(name + " стрибає по деревах.");
    }


    @Override
    public void feed(Food food) {
        if (food.getType() == FoodType.РОСЛИНИ) {
            hunger = Math.max(0, hunger - food.getNutrition());
            System.out.println(name + " з'їла " + food.getName());
        } else {
            System.out.println(name + " не їсть " + food.getName());
        }
    }
}
