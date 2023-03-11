import java.util.Scanner;

public class Player {

    private String name;
    private int number;

    void createPlayer(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
