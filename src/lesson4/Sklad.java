package lesson4;

public class Sklad {
    public static int count = 0;
// private int count = 0;
    private String name;
//    private String nameGruzchik;


    public Sklad (int tovarKol) {
        this.name = "водка";
        this.count = tovarKol;
    }

    public String getOstatki() {
        return "Остатки " + this.name + " в количестве " + this.count + " шт";
    }

    public void zagruzil (int kolichestvo) {
        this.count += kolichestvo;
    }
    public void razgruzil (int kolichestvo) {
        this.count -= kolichestvo;
    }

}
