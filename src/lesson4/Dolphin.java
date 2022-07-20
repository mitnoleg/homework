package lesson4;

public class Dolphin {
    private String name;
    private int age;

    public Dolphin  (String dolphinName, int dolphinAge) {
        this.name = dolphinName;
        this.age = dolphinAge;
    }

    public String getData() {
        return "Дельфин " + this.name + " дожил до " + this.age + " лет";
    }
    public String getAge() {
        return this.age + " лет";
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
}