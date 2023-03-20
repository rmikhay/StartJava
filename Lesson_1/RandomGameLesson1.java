import java.util.Random;

public class RandomGameLesson1 {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        int answer = 50;
        while (answer != randomNumber) {
            if (randomNumber > answer) {
                System.out.println("число " + answer + " меньше того, что загадал компьютер");
                answer += 1;
            } else {
                System.out.println("число " + answer + " больше того, что загадал компьютер");
                answer--;
            }
        }
        System.out.println("Вы победили. Загадано число " + answer);
    }
}
