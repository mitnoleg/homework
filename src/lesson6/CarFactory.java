package lesson6;

public class CarFactory {
    public static Car novyeZhiguli() {
        return new Vaz();
    }
    public static Car novyeToyota() {
        return new Toyota();
    }

}
