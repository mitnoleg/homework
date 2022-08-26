package module1.lesson8.base;

public class Airplane  implements  Flying{
    private int countPassengers;
    private String homeCountry;

    public Airplane(int countPassengers, String homeCountry) {
        this.countPassengers = countPassengers;
        this.homeCountry = homeCountry;
    }

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
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
