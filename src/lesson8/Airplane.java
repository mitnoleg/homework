package lesson8;

public class Airplane  implements  Flying{
    private int countPassengers;
    private String homeСountry;

    public Airplane(int countPassengers, String homeСountry) {
        this.countPassengers = countPassengers;
        this.homeСountry = homeСountry;
    }

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public String getHomeСountry() {
        return homeСountry;
    }

    public void setHomeСountry(String homeСountry) {
        this.homeСountry = homeСountry;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (this.countPassengers > 0) {
            System.out.println("самолет летит");
        }
        else {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
    }
}
