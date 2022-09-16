package module2.lesson8;

public class UserMeta {
    private String name;
    private int count;

    public UserMeta(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void GetSuperName(String prefix){
        System.out.println(prefix+ " " + name);
    }

    @Override
    public String toString() {
        return "UserMeta{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
