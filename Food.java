public class Food {
    private String name;
    private FoodType type;
    private int nutrition;


    public Food(String name, FoodType type, int nutrition) {
        this.name = name;
        this.type = type;
        this.nutrition = nutrition;
    }


    public String getName() {
        return name;
    }


    public FoodType getType() {
        return type;
    }


    public int getNutrition() {
        return nutrition;
    }
}
