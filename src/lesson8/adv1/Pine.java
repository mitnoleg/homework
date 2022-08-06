package lesson8.adv1;

public class Pine extends Tree implements Smelling{
    public Pine(String name, TreeClass type, boolean hasBumps, boolean smelling) {
        super(name, type, hasBumps, smelling);
    }

    @Override
    public void smell() {
        System.out.println("Сосна : умеет пахнуть");
    }
}
