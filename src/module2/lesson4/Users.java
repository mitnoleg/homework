package module2.lesson4;

import java.util.List;

public class Users {
    private int number;

    public int getNumber() {
        return number;
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    private List<Integer> listOfNumbers;

    public Users(int number) {
        this.number = number;
    }

    public void setListOfNumbers(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }
}
