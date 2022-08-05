package lesson8;

public class Duck implements Flying {
    private boolean isInjured;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Duck(boolean isInjured, String color) {
        this.isInjured = isInjured;
        this.color = color;
    }

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() throws FlyException {
        if (!this.isInjured){
            System.out.println("утка летит");
        }
        else {
            throw new FlyException("Ошибка: утка ранена");
        }


    }
}
