package module2.lesson8;

@GetMetaData
public class UserMeta {
    @GetMetaData
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
    @GetMetaData
    public void GetSuperName(String prefix) throws InterruptedException {
        Thread.sleep(1000);
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
