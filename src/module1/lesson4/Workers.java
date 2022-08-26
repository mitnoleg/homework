package module1.lesson4;

public class Workers {
    private int countBoj = 0;
    private int workerAge;
    private String workerName;
//    private String sklad;
    public Workers (String workerName,int workerAge ) {
        this.workerName = workerName;
        this.countBoj = countBoj;
        this.workerAge = workerAge;
    }
    public String getboj() {
        return "Работник " + this.workerName + "  разбил товар в количестве " + this.countBoj + " шт";
    }

    public void setCountBoj(int countBoj) {
        Sklad.count -= countBoj;
        this.countBoj += countBoj;
        System.out.println(this.workerName + ": Ура я испортил водку в количестве "+ countBoj + " штук!");
    }
}
