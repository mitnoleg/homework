package module1.lesson8.adv1;

public class Rose extends Plant implements Smelling,Flowering{
    public Rose(String name, PlantDepartment department, boolean flowering) {
        super(name, department, flowering);
    }

    @Override
    public void bloom() {
        System.out.println("Роза : умеет цвести");
    }

    @Override
    public void smell() {
        System.out.println("Роза : умеет пахнуть");

    }
}
