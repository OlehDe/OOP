public class Main {
    public static void main(String[] args) {


        Food meat = new Food("М'ясо курки", FoodType.МЯСО, 50);
        Food grass = new Food("Свіжа трава", FoodType.РОСЛИНИ, 30);


        Lion simba = new Lion("Сімба", 5, 190.5, "Вольєр 1");
        Elephant dumbo = new Elephant("Дамбо", 10, 1200, "Вольєр 2");
        Monkey koko = new Monkey("Коко", 3, 35, "Вольєр 3");


        Feeder ivan = new Feeder(1, "Іван", 1);
        Trainer olena = new Trainer(2, "Олена", 3);


        Zoo zoo = new Zoo();
        zoo.addAnimal(simba);
        zoo.addAnimal(dumbo);
        zoo.addAnimal(koko);


        zoo.addEmployee(ivan);
        zoo.addEmployee(olena);


        ivan.feedAnimal(simba, meat);
        ivan.feedAnimal(dumbo, grass);
        olena.trainAnimal(koko);
        olena.describeAnimal(simba);


        zoo.updateExperience(1, 3);
        ivan.feedAnimal(simba, meat);
    }
}
