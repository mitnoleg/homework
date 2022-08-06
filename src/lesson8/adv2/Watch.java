package lesson8.adv2;

public class Watch {
    private boolean isBroken;

    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }
    public void tick() throws WatchBrokenError {
        if (isBroken) {
            throw new WatchBrokenError("Ошибка: Часы сломались.");
        }
        System.out.println("Часы тикают");
    }

}
