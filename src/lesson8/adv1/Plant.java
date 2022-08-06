package lesson8.adv1;

public abstract class Plant {
    private String name;
    PlantDepartment department;
    private boolean flowering;
    private boolean smelling;

    public Plant(String name, PlantDepartment department, boolean flowering) {
        this.name = name;
        this.department = department;
        this.flowering = flowering;
    }

    public Plant(String name, PlantDepartment department, boolean flowering, boolean smelling) {
        this.name = name;
        this.department = department;
        this.flowering = flowering;
        this.smelling = smelling;
    }


//    public void bloom() {
//        if (this.flowering) {
//            System.out.println(this.name + " : умеет цвести");
//        }
//    }
//
//    @Override
//    public void smell() {
//        if (this.smelling) {
//        System.out.println(this.name + " : умеет пахнуть");
//        }
//
//    }
}
