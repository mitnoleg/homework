package lesson4;

public class Sklad {
    public static int count = 0;
    private String name;


    public Sklad (int tovarKol) {
        this.name = "vodka";
        this.count = tovarKol;
    }

    public String getOstatki() {
        return "Остатки " + this.name + " в количестве " + this.count + " шт";
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

}
