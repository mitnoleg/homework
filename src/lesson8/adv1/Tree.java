package lesson8.adv1;

public abstract class Tree {
    private String name;
    TreeClass type;
    private boolean hasBumps;
    private boolean smelling;

    public Tree(String name, TreeClass type, boolean hasBumps, boolean smelling) {
        this.name = name;
        this.type = type;
        this.hasBumps = hasBumps;
        this.smelling = smelling;
    }


//    @Override
//    public void smell() {
//        if (this.smelling) {
//            System.out.println(this.name + " : умеет пахнуть");
//        }
//    }
}
