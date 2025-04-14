package pr8;

import java.util.ArrayList;


public class Zoo {
    private ArrayList<Animal> animals;
    private ArrayList<ZooEmployee> employees;


    public Zoo() {
        animals = new ArrayList<>();
        employees = new ArrayList<>();
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }


    public void addEmployee(ZooEmployee employee) {
        employees.add(employee);
    }


    public void updateExperience(int empId, int newExp) {
        for (ZooEmployee emp : employees) {
            if (emp.getId() == empId) {
                emp.setExperience(newExp);
                System.out.println("Оновлено досвід працівника " + emp.name + " до " + newExp);
                return;
            }
        }
        System.out.println("Працівника не знайдено.");
    }
}

