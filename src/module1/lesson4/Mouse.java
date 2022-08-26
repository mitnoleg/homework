package module1.lesson4;

public class Mouse {
    private String name;
    private String color;

    public Mouse (String mouseName, String mouseColor) {
        this.name = mouseName;
        this.color = mouseColor;
    }

    public String getData() {
        return "Мышь " + this.name + " " + this.color + " цвета";
    }
    public String getColor() {
        return this.color + " цвета";
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
}
