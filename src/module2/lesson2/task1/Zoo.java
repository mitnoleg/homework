package module2.lesson2.task1;

public class Zoo <Q extends AnimalSwimable, W extends AnimalFlyable, E extends AnimalBitable> {
    private Q AnimalSwimable;
    private W AnimalFlyable;
    private E AnimalBitable;

    public Zoo(Q animalSwimable, W animalFlyable, E animalBitable) {
        AnimalSwimable = animalSwimable;
        AnimalFlyable = animalFlyable;
        AnimalBitable = animalBitable;
    }

    public Q getAnimalSwimable() {
        return AnimalSwimable;
    }

    public W getAnimalFlyable() {
        return AnimalFlyable;
    }

    public E getAnimalBitable() {
        return AnimalBitable;
    }
    public void setAnimalSwimable(Q AnimalSwimable) {
        AnimalSwimable = AnimalSwimable;
    }

    public void setAnimalFlyable(W AnimalFlyable) {
        AnimalFlyable = AnimalFlyable;
    }

    public void setAnimalBitable(E AnimalBitable) {
        AnimalBitable = AnimalBitable;
    }

    public void feedFlyable() {
        System.out.println("Летающее животное ест");
        AnimalFlyable.fly();
    }
    public void feedSwimable() {
        System.out.println("Плавающее животное ест");
        AnimalSwimable.swim();
    }
    public void feedBitable() {
        System.out.println("Кусающее животное ест");
        AnimalBitable.bite();
    }
}
