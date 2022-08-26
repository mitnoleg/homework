package module1.lesson8.adv1;

public class Spruce extends Tree implements Smelling{

    public Spruce(String name, TreeClass type, boolean hasBumps, boolean smelling) {
        super(name, type, hasBumps, smelling);
    }

    @Override
    public void smell() {
            System.out.println("Ель : умеет пахнуть");
    }
}
