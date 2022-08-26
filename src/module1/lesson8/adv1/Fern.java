package module1.lesson8.adv1;

public class Fern extends Plant implements Flowering{
    public Fern(String name, PlantDepartment department, boolean flowering) {
        super(name, department, flowering);
    }

    @Override
    public void bloom() {
        System.out.println("Папоротник : умеет цвести");
    }
}
