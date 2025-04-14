package pr8;

public abstract class ZooEmployee {
    protected int id;
    protected String name;
    protected int experience; // 1-4
    protected String role;


    public ZooEmployee(int id, String name, int experience, String role) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.role = role;
    }


    public void describeAnimal(Animal animal) {
        System.out.println(animal.getInfo());
    }


    public int getId() {
        return id;
    }


    public void setExperience(int experience) {
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }
}
